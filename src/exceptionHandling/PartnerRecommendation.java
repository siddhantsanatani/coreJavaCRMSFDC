package exceptionHandling;

class Business {
	int nseValue;
	int netWorth;

	public Business(int netWorth, int nseValue) {
		this.nseValue = nseValue;
		this.netWorth = netWorth;
	}
}

class Validator {
	public String billionWorth(Business business) throws BusinessException {
		if (business.netWorth < 50) {
			throw new BusinessException("Not to be Recommended");
		}
		if (business.nseValue < 0) {
			throw new BusinessException("Company under loss");
		} else {
			return "Recommended";
		}
	}

	public String recommendPartner(Business business) throws BusinessException {
		try {
			billionWorth(business);
		} catch (final BusinessException e) {
			return "Not Recommended";
		} catch (final Exception e) {
			return "Other Exception";
		}
		return "Partnership Available";

	}
}

class BusinessException extends Exception {
	private static final long serialVersionUID = 1L;

	public BusinessException(String msg) {
		super(msg);
	}

}

public class PartnerRecommendation {
	public static void main(String[] args) {
		final Business business = new Business(67, 5);
		final Validator v = new Validator();
		String s = "";
		String t = "";
		try {
			s = v.billionWorth(business);
			t = v.recommendPartner(business);
//			System.out.println(s.toLowerCase());
//			System.out.println(t.toLowerCase());
		} catch (final BusinessException e) {
			System.out.println(e.getMessage().toLowerCase());
		}
		System.out.println(s.toLowerCase());
		System.out.println(t.toLowerCase());

	}
}
