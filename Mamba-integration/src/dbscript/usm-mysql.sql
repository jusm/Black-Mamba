USE `mamba`;
DROP TABLE IF EXISTS `usm_admin`;
CREATE TABLE `usm_admin` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `login_name` varchar(32) NOT NULL,
  `real_name` varchar(64) DEFAULT NULL,
  `login_paw` varchar(256) NOT NULL,
  `login_count` bigint(20) unsigned NOT NULL DEFAULT '0',
  `last_login_date` timestamp NULL DEFAULT NULL,
  `last_login_ip` varchar(256) DEFAULT NULL,
  `ROLE_ID` int(10) DEFAULT NULL COMMENT '权限角色编码的id',
  `updatedate` timestamp NULL DEFAULT NULL,
  `createdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `index_unique_login_name` (`login_name`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;