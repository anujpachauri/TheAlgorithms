package dynamicProgramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TimeBuySellStock {

	
	public int maxProfit(int prices[]) {
		int max=0;	
		for(int i=0;i<prices.length;++i) {
			
			int buy=prices[i];
			
			for(int j=i+1;j<prices.length;++j) {
				
				int sell=prices[j];
				int profit=sell-buy;
				if(profit>max) {
					max=profit;
				}
				
			}
			
		}
		
		return max;
	}
	
	@Test
	public void testMaxProfit() {
		int[] prices= {7,1,5,3,6,4};
		assertEquals(5, maxProfit(prices));
	}
	
	@Test
	public void testMaxProfitII() {
		int[] prices= {7,6,4,3,1};
		assertEquals(0, maxProfit(prices));
	}
	
	
	
	
}
