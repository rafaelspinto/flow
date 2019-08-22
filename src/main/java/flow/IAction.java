package flow;

public interface IAction<T> {
  T execute();

  String getType();
}
