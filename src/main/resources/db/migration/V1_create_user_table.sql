-- auto-generated definition
CREATE TABLE t_community_user
(
  id            INT AUTO_INCREMENT PRIMARY KEY,
  account_id    VARCHAR(100) NULL,
  name          VARCHAR(50)  NULL,
  token         CHAR(36)     NULL,
  create_id     BIGINT       NULL,
  last_modifyId BIGINT       NULL
);