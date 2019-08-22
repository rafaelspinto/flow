package flow;

public interface IApp<T> {
  T in(IEvent event);
}
