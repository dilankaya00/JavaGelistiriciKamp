
public class CampaignManager implements CampaignManagerDao {

	@Override
	public void addCampaign(Campaigns campaigns) {
		System.out.println("New campaign added: "+ campaigns.getName());
		
	}

	@Override
	public void deleteCampaign(Campaigns campaigns) {
		System.out.println("Campaign deleted: "+ campaigns.getName());
		
	}

	@Override
	public void updateCampaign(Campaigns campaigns) {
		System.out.println("Campaign updated: "+ campaigns.getName());
		
	}

}
