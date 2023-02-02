package dmit2015.faces;

import dmit2015.model.Circle;
import lombok.Getter;
import lombok.Setter;
import org.omnifaces.util.Messages;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named ("currentCircleRequestScopedController")
@RequestScoped  // create this object for one HTTP request and destroy after the HTTP response has been sent
public class CircleRequestScopedController {

	@Getter
	@Setter
	private double radius;

	public String calculateArea() {
		var currentCircle = new Circle (radius);
		Messages.addGlobalInfo ("Circle Area = {0}", currentCircle.area());
		return null;
	}

	public String calculateDiameter() {
		var currentCircle = new Circle (radius);
		Messages.addGlobalInfo ("Circle Diameter = {0}", currentCircle.diameter());
		return null;
	}

	public String calculateCircumference() {
		var currentCircle = new Circle (radius);
		Messages.addGlobalInfo ("Circle Circumference = {0}", currentCircle.circumference());
		return null;
	}
}
