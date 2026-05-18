package io.git.petersoson.btgpactual.orderms.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "btgpactualdb";
    }

    @Override
    public MongoClient mongoClient() {
        return MongoClients.create("mongodb://admin:123@localhost:27017/btgpactualdb?authSource=admin");
    }
}