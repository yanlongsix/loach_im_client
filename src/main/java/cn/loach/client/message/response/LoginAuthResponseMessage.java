package cn.loach.client.message.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class LoginAuthResponseMessage extends ResponseMessage implements Serializable {

    /**
     * 用户名
     */
    private String userName;

    /**
     * token
     */
    private String token;

    public LoginAuthResponseMessage() {
    }
}
