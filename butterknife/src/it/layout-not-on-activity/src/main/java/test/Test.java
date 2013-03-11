package test;

import android.app.Application;
import butterknife.InjectLayout;
import butterknife.InjectView;

@InjectLayout(1);
public class Test extends Application {
  @InjectView(2) TextView thing;
}
