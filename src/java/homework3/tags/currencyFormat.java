/*
 Copyright © 2016 Erik Borchers and Sarah Hennenkamp
 */
package homework3.tags;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.text.NumberFormat;

public class currencyFormat extends TagSupport {
  private double format;

  public void setFormat(double format) {
    this.format = format;
  }
                        
  @Override
  public int doStartTag() throws JspException {
    try {
      //Import a currency formatter
      NumberFormat formatter = NumberFormat.getCurrencyInstance();
      //Format everything so it can be sent to a result page
      String resultAmount = formatter.format(format);
      
      JspWriter out = pageContext.getOut();
      out.print(resultAmount);
      
    } catch (IOException ioe) {
      System.out.println(ioe);
    }
    return SKIP_BODY;
  }
}
