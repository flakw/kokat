package pl.com.audeo.kokat;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

/**
 * User: Wojtek
 * Date: 2016-07-20
 * Time: 17:40
 */
@SpringUI
public class MyVaadinUI extends UI {
	@Override
	protected void init(VaadinRequest vaadinRequest) {
		setContent(new Button("Click me", e-> Notification.show("Hello Spring+Vaadin user!")));
	}
}