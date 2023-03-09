import static org.mockito.Mockito.when;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.when;

import com.rewards.calculator.model.Rewards;
import com.rewards.calculator.service.RewardsServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class RewardsServiceImplTest {

	@InjectMocks
	RewardsServiceImpl rewardsServiceImpl;
	
	@Test
	public void getRewardsByCustomerIdTest() {
		Long customerId = 123;
		Rewards rewards = new Rewards();
		rewards.setCustomerId(123);
		rewards.setLastMonthRewardPoints(20);
		rewards.setLastSecondMonthRewardPoints(30);
		rewards.setTotalRewards(90);
		when(rewardsServiceImpl.getRewardsByCustomerId(customerId)).thenReturn(rewards);
		Rewards rewards2 = rewardsServiceImpl.getRewardsByCustomerId(customerId);
		assertThat(rewards2.getCustomerId()).isSameAs(rewards.getCustomerId());
		
	}
}
