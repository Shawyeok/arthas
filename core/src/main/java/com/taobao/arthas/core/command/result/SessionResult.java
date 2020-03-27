package com.taobao.arthas.core.command.result;

/**
 * Session command result model
 *
 * @author gongdewei 2020.03.27
 */
public class SessionResult extends ExecResult {

    private long javaPid;
    private String sessionId;
    private String agentId;
    private String tunnelServer;
    private String statUrl;

    @Override
    public String getType() {
        return "session";
    }

    public long getJavaPid() {
        return javaPid;
    }

    public void setJavaPid(long javaPid) {
        this.javaPid = javaPid;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getTunnelServer() {
        return tunnelServer;
    }

    public void setTunnelServer(String tunnelServer) {
        this.tunnelServer = tunnelServer;
    }

    public String getStatUrl() {
        return statUrl;
    }

    public void setStatUrl(String statUrl) {
        this.statUrl = statUrl;
    }
}
