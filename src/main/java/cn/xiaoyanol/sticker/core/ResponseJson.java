package cn.xiaoyanol.sticker.core;

/**
 * 响应消息结构
 */
public class ResponseJson {
    private Integer code;

    private String msg;

    private Object data;

    public ResponseJson(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseJson(){}

    public ResponseJson(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ResponseJson getSuccessResponseJson() {
        return new ResponseJson(0, "ok");
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
