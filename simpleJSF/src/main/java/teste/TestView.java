package teste;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String string ="string";

	@PostConstruct
	public void init() {
		string = "String2!!!";

	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

}
