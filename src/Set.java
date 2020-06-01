/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/6/1 23:40
 **/
public interface Set<E> {
    void add(E e);
    void remove(E e);
    boolean contains(E e);
    int getSize();
    boolean isEmpty();
}
