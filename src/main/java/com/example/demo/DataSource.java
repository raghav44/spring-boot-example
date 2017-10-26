package com.example.demo;

public class DataSource {

    @Override
    public String toString() {
        return "DataSource{" +
                "server='" + server + '\'' +
                ", port=" + port +
                '}';
    }

    public DataSource(String server, int port) {
        this.server = server;
        this.port = port;
    }

    private String server;
    private int port;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
