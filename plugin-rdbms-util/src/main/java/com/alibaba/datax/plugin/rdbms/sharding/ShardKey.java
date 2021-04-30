package com.alibaba.datax.plugin.rdbms.sharding;

public interface ShardKey {
    /**
     * @see ShardConstant#SHARDING_JDBC
     */
    String SHARDING_TYPE ="shardingType";

    String SHARDING_CONFIG_PATH ="shardingConfigPath";
}
