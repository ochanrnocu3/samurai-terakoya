import org.junit.platform.commons.util.StringUtils;

public class Price {
	
			
	public double calcPrice(String customerType){		
		double price;
		int basePrice = 1000;
		
//	if (customerType.equals(null)) {
//		throw new NullPointerException("customerTypeが入力されていません。");
		// 引数のチェックは分離する
		// チェックに引っかかったらエラーとする
	if (StringUtils.isBlank(customerType)) {
	throw new NullPointerException("customerTypeが入力されていません。");

		
		
	} else if (customerType.equals("toddler")) {
		  price = basePrice * 0.25;
		  
	} else if(customerType.equals("student")) {
    	price = basePrice * 0.5;
    	
    } else {
    	price = basePrice;
    }
	return price;
  }
}
