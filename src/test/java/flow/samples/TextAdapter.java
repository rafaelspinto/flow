package flow.samples;

import flow.IAction;
import flow.IAdapter;
import flow.IEvent;

public class TextAdapter implements IAdapter<IAction> {
  public IEvent adapt(IAction action) {
    String value = (String) action.execute();
    return new TextEvent(value);
  }
}
