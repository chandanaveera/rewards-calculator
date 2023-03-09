


@RunWith(SpringRunner.class)
@WebMvcTest(RewardsController.class)
public class RewardsControllerTest {

	@Autowired
    private MockMvc mockMvc;
	
	@Test
	public void testRewardsControllerwithException() throws Exception{
		
		mockMvc.perform(get("/customers/123/rewards"))
        .andDo(print())
        .andExpect(status.isNotFound())
	}
}
