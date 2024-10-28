package client;

public class MqttConfig {
    /**
     * 服务地址
     */
    private String servers;

    /**
     * 客户端id
     */
    private String clientId;

    /**
     * 服务端id
     */
    private String serverClientId;

    /**
     * 默认主题
     */
    private String defaultTopic;

    /**
     * 用户名
     */
    private String username;

  /*  public MqttConnectOptions mqttConnectOptions() {
        MqttConnectOptions options = new MqttConnectOptions();
        //断开后，是否自动连接
        options.setAutomaticReconnect(true);
        // 设置是否清空session,这里如果设置为false表示服务器会保留客户端的连接记录，
        // 把配置里的 cleanSession 设为false，客户端掉线后 服务器端不会清除session，
        // 当重连后可以接收之前订阅主题的消息。当客户端上线后会接受到它离线的这段时间的消息
        options.setCleanSession(false);
        // 设置连接的用户名
        options.setUserName(username);
        // 设置连接的密码
        options.setPassword(password.toCharArray());
        options.setServerURIs(servers.split(","));
        // 设置超时时间 单位为秒
        options.setConnectionTimeout(10);
        // 设置会话心跳时间 单位为秒 服务器会每隔1.5*20秒的时间向客户端发送心跳判断客户端是否在线，但这个方法并没有重连的机制
        options.setKeepAliveInterval(20);
        // 设置“遗嘱”消息的话题，若客户端与服务器之间的连接意外中断，服务器将发布客户端的“遗嘱”消息。
        //        options.setWill("willTopic", WILL_DATA, 2, false);
        return options;
    }
*/

    public String getServers() {
        return servers;
    }

    public void setServers(String servers) {
        this.servers = servers;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getServerClientId() {
        return serverClientId;
    }

    public void setServerClientId(String serverClientId) {
        this.serverClientId = serverClientId;
    }

    public String getDefaultTopic() {
        return defaultTopic;
    }

    public void setDefaultTopic(String defaultTopic) {
        this.defaultTopic = defaultTopic;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
