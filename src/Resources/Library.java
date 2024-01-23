package Resources;

import java.util.ArrayList;

public class Library {

	private ArrayList<Asset> assets = new ArrayList<>();

	public boolean add(Asset asset) {

		return this.assets.add(asset);
	}

	@Override
	public String toString() {
		String result = "";

		for (Asset asset : assets) {
			result += asset.toString();
		}

		return result;
	}

	public boolean checkOut(Asset asset) {
		return this.assets.remove(asset);

	}

	public boolean checkOut(int id) {
		for (Asset asset : this.assets) {

			if (id == asset.getId()) {

				asset.setAvailable(false);
				return true;
			}

		}

		return false;
	}
}
