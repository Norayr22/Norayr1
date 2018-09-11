import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Helper {
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public static String GenerateStringFromResource(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }

    public static void main(String[] args) throws InterruptedException {



        Date currentDate = new Date();
        System.out.println(dateFormat.format(currentDate));

        // convert date to calendar
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);

        // manipulate date
        c.add(Calendar.YEAR, 1);
        c.add(Calendar.MONTH, 1);
        c.add(Calendar.DATE, 1); //same with c.add(Calendar.DAY_OF_MONTH, 1);
        c.add(Calendar.HOUR, 1);
        c.add(Calendar.MINUTE, 1);
        c.add(Calendar.SECOND, 1);

        // convert calendar to date
        Date currentDatePlusOne = c.getTime();

        System.out.println(dateFormat.format(currentDatePlusOne));
        System.out.println(Helper.test());
    }

    public static JSONObject test() throws InterruptedException {
        JSONArray files = new JSONArray();
        files.add("GOOGLE");
        files.add("FACEBOOK");

        JSONArray keywords = new JSONArray();
        keywords.add("PoI");
        keywords.add("Location");
        keywords.add("Cleasning");
        keywords.add("Map");
        keywords.add("Venue");
        keywords.add("Place");
        keywords.add("Business");

        JSONArray additionalCategories = new JSONArray();
        additionalCategories.add("atm");
        additionalCategories.add("car_wash");
        additionalCategories.add("restaurant");
        additionalCategories.add("parking_lot");
        additionalCategories.add("parking_lot_for_bicycles");



        JSONArray publicationChannels = new JSONArray();
        publicationChannels.add("APPLE");
        publicationChannels.add("GOOGLE");
        publicationChannels.add("HERE");
        publicationChannels.add("TOMTOM");
        publicationChannels.add("WAZE");
        publicationChannels.add("UBER");
        publicationChannels.add("BING");
        publicationChannels.add("FACTUAL");
        publicationChannels.add("FOURSQUARE");
        publicationChannels.add("NAVMII");
        publicationChannels.add("FACEBOOK");
        publicationChannels.add("APPLE");

        JSONArray socialMediaUrls = new JSONArray();
        socialMediaUrls.add("https://facebook.com/navads");
        socialMediaUrls.add("https://twitter.com/navads");
        socialMediaUrls.add("https://youtube.com/navads");

        JSONObject contacts = new JSONObject();
        contacts.put("phoneNumber","+31207073685");
        contacts.put("faxNumber","+31207073685");
        contacts.put("emailAddress","info@navads.eu");
        contacts.put("websiteUrl","https://navads.eu");
        contacts.put("brandUrl", "https://navads.eu");
        contacts.put("socialMediaUrls",socialMediaUrls);

        JSONObject date1 = new JSONObject();
        date1.put("fromTime","00:00");
        date1.put("toTime","23:59");

        JSONObject date2 = new JSONObject();
        date2.put("fromTime","08:00");
        date2.put("toTime","12:30");
        JSONObject date3 = new JSONObject();
        date3.put("fromTime","13:00");
        date3.put("toTime","17:30");

        JSONArray openingHours1 = new JSONArray();
        openingHours1.add(date2);
        openingHours1.add(date3);

        JSONArray openingHours2 = new JSONArray();
        openingHours2.add(date1);


        JSONObject date = new JSONObject();
        date.put("fromTime","08:00");
        date.put("toTime","17:30");

        JSONObject DATE1 = new JSONObject();
        DATE1.put("fromDate","2019-10-10");
        DATE1.put("toDate","2019-10-10");
        DATE1.put("closed",false);
        DATE1.put("openingHours",openingHours1);

        JSONObject DATE2 = new JSONObject();
        DATE2.put("fromDate","2019-10-20");
        DATE2.put("toDate","2019-10-20");
        DATE2.put("closed",false);
        DATE2.put("openingHours",openingHours2);

        JSONObject DATE3 = new JSONObject();
        DATE3.put("fromDate","2019-10-10");
        DATE3.put("toDate","2019-10-10");
        DATE3.put("closed",true);





        JSONArray MONDAY = new JSONArray();
        MONDAY.add(date);
        JSONArray TUESDAY = new JSONArray();
        TUESDAY.add(date);
        JSONArray WEDNESDAY = new JSONArray();
        WEDNESDAY.add(date);
        JSONArray THURSDAY = new JSONArray();
        THURSDAY.add(date);
        JSONArray FRIDAY = new JSONArray();
        FRIDAY.add(date);
        JSONArray SATURDAY = new JSONArray();
        SATURDAY.add(date);
        JSONArray SUNDAY = new JSONArray();
        SUNDAY.add(date);

        JSONArray specialHours = new JSONArray();
        specialHours.add(DATE1);
        specialHours.add(DATE2);
        specialHours.add(DATE3);


        JSONObject openingHours = new JSONObject();
        openingHours.put("MONDAY",MONDAY);
        openingHours.put("TUESDAY",TUESDAY);
        openingHours.put("WEDNESDAY",WEDNESDAY);
        openingHours.put("THURSDAY",THURSDAY);
        openingHours.put("FRIDAY",FRIDAY);
        openingHours.put("SATURDAY",SATURDAY);
        openingHours.put("SUNDAY",SUNDAY);


        JSONObject position = new JSONObject();
        position.put("latitude",52.3608601);
        position.put("longitude",4.8856176);

        JSONObject address = new JSONObject();
        address.put("country","NL");
        address.put("state","North Holland");
        address.put("city","Amsterdam");
        address.put("postalCode","1017 SB");
        address.put("street", "Weteringschans");
        address.put("houseNumber","109");
        address.put("directions","3rd floor");

        JSONObject details = new JSONObject();
        details.put( "name", "Navads");
        details.put("displayName", "Navads");
        details.put("brand","Navads");
        details.put("logoUrl","https://navads.eu/wp-content/themes/nav/images/navads-logo.png");
        details.put("language", "en");
        details.put("description", "We put your business on the map");
        details.put("extendedDescription", "We put your business on the map. The leading platform managing local listings for both Enterprise clients and Digital Agencies on all global digital maps platforms.");
        details.put("primaryCategory","gas_station");
        details.put("openingDate", "2006-01-01");
        details.put("additionalCategories",additionalCategories);
        details.put("keywords", keywords);
        details.put("contacts", contacts);
        details.put("position", position);
        details.put("address", address);
        details.put("openingHours", openingHours);
        details.put("specialHours", specialHours);



        JSONObject background = new JSONObject();
        background.put("gradient", "");

        JSONObject link = new JSONObject();
        link.put("title", "");
        link.put("image", "");
        link.put("url", "");
        link.put("description", "");

        JSONObject finald = new JSONObject();
        finald.put("publicationChannels", publicationChannels);
        finald.put("hideAddress", false);
        finald.put("groupId", "main group");
        finald.put("details",details);


        return finald;
    }
}
