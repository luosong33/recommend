CREATE TABLE `label` (
  `id` varchar(20) NOT NULL,
  `preference` varchar(20) NOT NULL COMMENT '标签分类',
  `interested` varchar(100) NOT NULL COMMENT '标签名称',
  `created` datetime NOT NULL COMMENT '创建时间',
  `updated` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='标签表';

CREATE TABLE `real_time_rules` (
  `id` varchar(20) NOT NULL,
  `preference` varchar(20) NOT NULL COMMENT '喜好阈值',
  `interested` varchar(100) NOT NULL COMMENT '感兴趣阈值',
  `may_interested` int(3) NOT NULL COMMENT '可能感兴趣阈值',
  `created` datetime NOT NULL COMMENT '创建时间',
  `updated` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='实时规则表';