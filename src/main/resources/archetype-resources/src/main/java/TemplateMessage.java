package ${package};

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TemplateMessage {

  public String param;

  public TemplateMessage() {
  }

  public TemplateMessage(String param) {
    this.param = param;
  }
}
