
public class Stringoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names = "suneel, john, jenny, jack, joe";
		System.out.println("names :" + names);
		int len = names.length();
		System.out.println("length of the names is :" + len);
		char ch = names.charAt(len - 1);
		System.out.println("ch is :" + ch);
		int idx = names.lastIndexOf('o');
		System.out.println("o last index is :" + idx);
		idx = names.indexOf("jenny");
		System.out.println("index of jenny is :" + idx);
		String names1 = names.toUpperCase();
		System.out.println(" names is :" + names);
		System.out.println("names in upper case :" + names1);
		String names3 = names1.replace('J', 'K');
		System.out.println("the replaced string is: " + names3);
		String name = names1.substring(6, 12);
		System.out.println("Substring :" + name);
		String attendeename = "john-  11547835";
		String[] data = attendeename.split("-");
		for (String h : data) {
			System.out.println(h.trim());
		}
		String email = "john@j.com";
		if (email.contains("@") && email.contains(".com")) {
			System.out.println("email is valid");
		} else
			System.out.println("Invalid email");
		String pass = "";
		if (pass.isEmpty()) {
			System.out.println("Please enter the password with atlesat 8characters");
		}
		String chatMessage = "Hi, My Name is John. Please deliver the product on my address: 2144-B20 Redwood Shores";

		if (chatMessage.contains("address")) {
			System.out.println("Address Found in the Message");
			int i = chatMessage.indexOf("address");
			String address = chatMessage.substring(i);
			System.out.println("Delivery Of Product on Below Address");
			System.out.println(address);
		}
		String songName = "Hello.mp3";
		if (songName.endsWith(".mp3")) {
			System.out.println("AudioPlayer shall play " + songName);
		} else {
			System.out.println("Invalid File for Play Format: " + songName);
		}

		System.out.println();

		String[] phoneNumbers = { "+91 98765 12345", "+91 98765 11221", "+91 91625 28765", "+91 98141 12141",
				"+91 99155 66554", "+91 90909 12345", };

		String toSearch = "12";

		for (String phone : phoneNumbers) {
			// if(phone.startsWith(toSearch)) {
			if (phone.contains(toSearch)) {
				System.out.println(phone);
			}
		}
	}

}
