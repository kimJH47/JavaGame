package main.java.com.javaproject.protocol;
public class JoinData implements Protocol {

    private static final long serialVersionUID = 1L;

    public static final short LOGIN_FAILED = -10; // login access
    public static final short LOGIN_ACCESS = 10; // login access
    public static final short JOIN_FAILED = -20;// failed the join in the Queue
    public static final short JOIN_ACCESS = 20;// access the join in the Queue
    public static final short JOIN_REQUEST = 30;// join Request
    public static final short JOIN_ROOM = 40;

    public static final short Player_One = 0;
    public static final short Player_Two = 1;
    public static final short Player_Three = 2;
    public static final short Player_Four = 3;


    private boolean flag = false;
    private String message;
    private String name;
    private short protocol;

    public JoinData(short protocol) {
        this.protocol = protocol;
    }

    @Override
    public short getProtocol() {
        return protocol;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}