-- ENDERECO
INSERT INTO endereco (id, logradouro, numero, bairro, cidade, estado, cep, complemento) VALUES
(1, 'Rua das Flores', 123, 'Centro', 'São Paulo', 'SP', '01000-000', 'Próximo ao mercado'),
(2, 'Av. Brasil', 456, 'Jardim', 'Campinas', 'SP', '13000-000', ''),
(3, 'Rua Alvarez da Silva', 789, 'Bela Vista', 'Santos', 'SP', '11000-000', ''),
(4, 'Rua Brandão', 101, 'Industrial', 'Osasco', 'SP', '06000-000', 'Em frente ao posto'),
(5, 'Av. Paulista', 202, 'Paulista', 'São Paulo', 'SP', '01311-000', 'Andar 5');

-- LOCAL_MONITORADO
INSERT INTO local_monitorado (id, nome, fk_endereco, latitude, longitude, tipo_zona) VALUES
(1, 'Ponto Crítico 1', 1, -23.5505, -46.6333, 'Residencial'),
(2, 'Ponto Crítico 2', 2, -22.9099, -47.0626, 'Industrial'),
(3, 'Ponto Crítico 3', 3, -23.9608, -46.3336, 'Comercial'),
(4, 'Ponto Crítico 4', 4, -23.532, -46.791, 'Escolar'),
(5, 'Ponto Crítico 5', 5, -23.5617, -46.6561, 'Hospitalar');

-- SENSOR_LIXO
INSERT INTO sensor_lixo (id, tipo_sensor, data_instalacao, ativo, local_id) VALUES
(1, 'Ultrassônico', '2024-01-10', true, 1),
(2, 'Câmera', '2024-02-15', true, 2),
(3, 'LIDAR', '2024-03-01', false, 3),
(4, 'Infravermelho', '2024-01-20', true, 4),
(5, 'Ultrassônico', '2024-04-12', false, 5);

-- DETECCAO
INSERT INTO deteccao (id, data_deteccao, quantidade_lixo, imagem_base64, risco_enchente, sensor_id) VALUES
(1, '2024-05-01 08:00:00', 2.5, 'data:image/png;base64,AAA1', true, 1),
(2, '2024-05-02 09:15:00', 0.7, 'data:image/png;base64,AAA2', false, 1),
(3, '2024-05-03 10:00:00', 3.0, 'data:image/png;base64,AAA3', true, 2),
(4, '2024-05-04 11:30:00', 1.2, 'data:image/png;base64,AAA4', false, 3),
(5, '2024-05-05 12:45:00', 4.0, 'data:image/png;base64,AAA5', true, 4);

-- OCORRENCIA
INSERT INTO ocorrencia (id, descricao, data_ocorrencia, status, deteccao_id) VALUES
(1, 'Acúmulo de lixo próximo ao bueiro.', '2024-05-01 09:00:00', 'PENDENTE', 1),
(2, 'Pequena quantidade detectada.', '2024-05-02 10:00:00', 'RESOLVIDO', 2),
(3, 'Grande volume pode causar enchente.', '2024-05-03 11:00:00', 'EM_ANDAMENTO', 3),
(4, 'Nível aceitável.', '2024-05-04 12:00:00', 'RESOLVIDO', 4),
(5, 'Risco crítico em área escolar.', '2024-05-05 13:00:00', 'PENDENTE', 5);
