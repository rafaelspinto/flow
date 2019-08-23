package flow;

public interface IAction<T> {
  T execute() throws Exception;

  String getType();
}
