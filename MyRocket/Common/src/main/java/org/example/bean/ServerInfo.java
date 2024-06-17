package org.example.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@Data
public class ServerInfo {
    public int name;
    public int serverId;
    public int port;
}
