package application.protocol;

/**
 * 序列化基类
 * @version v1.0
 * @author 17120050
 * @date 3/9/2018
 */
public interface Protocol {

    public static final String PROTO_BUF = "protobuf";
    public static final String JAVA = "java";



    /**
     * 反序列化的方法
     * @param bytes
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T deSerialize(byte[] bytes, Class<?> clazz);

    /**
     * 序列化的方法
     * @param obj
     * @param <T>
     * @return
     */
    public <T> byte[] serialize( T obj );


}
