package com.goldenmire.restservices;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.net.JksOptions;

public class App {
    private Vertx vertx;
    private HttpServer server;

    public static void main(String[] args) {
        System.out.println("Hello world!");

        App app = new App(Vertx.vertx());
        app.startServer(result -> {
            if(result.failed()) {
                System.exit(1);
            }
        });

    }

    public App(Vertx vertx) {
        this.vertx = vertx;
    }

    public void startServer(Handler<AsyncResult<HttpServer>> handler) {
        HttpServerOptions options = new HttpServerOptions()
                .setPort(8080)
                .setSsl(true)
                .setKeyStoreOptions(new JksOptions().setPath("keystore.jks").setPassword("somepass"));
        server = vertx.createHttpServer(options);

        configureRoutes();

        server.listen(handler);
    }

    private void configureRoutes() {
        server.requestHandler(request -> {
            request.response().end("Hello world");
        });
    }
}
