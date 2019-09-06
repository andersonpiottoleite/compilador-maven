import org.junit.Assert;
import org.junit.Test;

import br.com.andersonpiotto.compile.SuperUtil;

public class SuperUtilTest {
	
	@Test
	public void escapeHTML4Test() {
		String escapedHtml = SuperUtil.escapeHTML("<script>alert(1);</script>");
        String expected = "&lt;script&gt;alert(1);&lt;/script&gt;"; 
        Assert.assertEquals(expected, escapedHtml);
	}

}
