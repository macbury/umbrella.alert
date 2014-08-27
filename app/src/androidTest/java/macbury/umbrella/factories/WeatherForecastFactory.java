package macbury.umbrella.factories;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by macbury on 27.08.14.
 */
public class WeatherForecastFactory {

  public static JSONObject rainNext6Hours() {
    try {
      return new JSONObject("{\n" +
              "\n" +
              "    \"cod\": \"200\",\n" +
              "    \"message\": 0.0021,\n" +
              "    \"city\": {\n" +
              "        \"id\": 3088150,\n" +
              "        \"name\": \"Prądnik Czerwony\",\n" +
              "        \"coord\": {\n" +
              "            \"lon\": 19.97604,\n" +
              "            \"lat\": 50.092468\n" +
              "        },\n" +
              "        \"country\": \"PL\",\n" +
              "        \"population\": 0\n" +
              "    },\n" +
              "    \"cnt\": 37,\n" +
              "    \"list\": [\n" +
              "        {\n" +
              "            \"dt\": 1409054400,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 286.14,\n" +
              "                \"temp_min\": 285.82,\n" +
              "                \"temp_max\": 286.14,\n" +
              "                \"pressure\": 981.74,\n" +
              "                \"sea_level\": 1020.71,\n" +
              "                \"grnd_level\": 981.74,\n" +
              "                \"humidity\": 100,\n" +
              "                \"temp_kf\": 0.32\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 500,\n" +
              "                    \"main\": \"Rain\",\n" +
              "                    \"description\": \"light rain\",\n" +
              "                    \"icon\": \"10d\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 92\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 3.57,\n" +
              "                \"deg\": 250.002\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 2\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"d\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-26 12:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409065200,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 288.08,\n" +
              "                \"temp_min\": 287.778,\n" +
              "                \"temp_max\": 288.08,\n" +
              "                \"pressure\": 981.85,\n" +
              "                \"sea_level\": 1020.81,\n" +
              "                \"grnd_level\": 981.85,\n" +
              "                \"humidity\": 90,\n" +
              "                \"temp_kf\": 0.3\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 803,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"broken clouds\",\n" +
              "                    \"icon\": \"04d\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 68\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 3.77,\n" +
              "                \"deg\": 283.001\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 1\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"d\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-26 15:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409076000,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 285.97,\n" +
              "                \"temp_min\": 285.678,\n" +
              "                \"temp_max\": 285.97,\n" +
              "                \"pressure\": 982.73,\n" +
              "                \"sea_level\": 1021.78,\n" +
              "                \"grnd_level\": 982.73,\n" +
              "                \"humidity\": 89,\n" +
              "                \"temp_kf\": 0.29\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 802,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"scattered clouds\",\n" +
              "                    \"icon\": \"03n\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 36\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 2.11,\n" +
              "                \"deg\": 279.001\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 1\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"n\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-26 18:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409086800,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 283.95,\n" +
              "                \"temp_min\": 283.677,\n" +
              "                \"temp_max\": 283.95,\n" +
              "                \"pressure\": 983.74,\n" +
              "                \"sea_level\": 1022.84,\n" +
              "                \"grnd_level\": 983.74,\n" +
              "                \"humidity\": 95,\n" +
              "                \"temp_kf\": 0.27\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 803,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"broken clouds\",\n" +
              "                    \"icon\": \"04n\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 76\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 1.95,\n" +
              "                \"deg\": 290.501\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 1\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"n\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-26 21:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409097600,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 282.84,\n" +
              "                \"temp_min\": 282.587,\n" +
              "                \"temp_max\": 282.84,\n" +
              "                \"pressure\": 983.65,\n" +
              "                \"sea_level\": 1022.91,\n" +
              "                \"grnd_level\": 983.65,\n" +
              "                \"humidity\": 94,\n" +
              "                \"temp_kf\": 0.26\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 802,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"scattered clouds\",\n" +
              "                    \"icon\": \"03n\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 48\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 1.31,\n" +
              "                \"deg\": 310.501\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 2\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"n\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-27 00:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409108400,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 282.2,\n" +
              "                \"temp_min\": 281.96,\n" +
              "                \"temp_max\": 282.2,\n" +
              "                \"pressure\": 984.03,\n" +
              "                \"sea_level\": 1023.29,\n" +
              "                \"grnd_level\": 984.03,\n" +
              "                \"humidity\": 93,\n" +
              "                \"temp_kf\": 0.24\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 803,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"broken clouds\",\n" +
              "                    \"icon\": \"04n\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 80\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 1.25,\n" +
              "                \"deg\": 58.0031\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 1\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"n\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-27 03:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409119200,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 285.01,\n" +
              "                \"temp_min\": 284.784,\n" +
              "                \"temp_max\": 285.01,\n" +
              "                \"pressure\": 983.89,\n" +
              "                \"sea_level\": 1023.02,\n" +
              "                \"grnd_level\": 983.89,\n" +
              "                \"humidity\": 100,\n" +
              "                \"temp_kf\": 0.22\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 804,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"overcast clouds\",\n" +
              "                    \"icon\": \"04d\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 92\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 1.97,\n" +
              "                \"deg\": 87.0009\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 2\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"d\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-27 06:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409130000,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 286.39,\n" +
              "                \"temp_min\": 286.186,\n" +
              "                \"temp_max\": 286.39,\n" +
              "                \"pressure\": 983.18,\n" +
              "                \"sea_level\": 1022.08,\n" +
              "                \"grnd_level\": 983.18,\n" +
              "                \"humidity\": 100,\n" +
              "                \"temp_kf\": 0.21\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 500,\n" +
              "                    \"main\": \"Rain\",\n" +
              "                    \"description\": \"light rain\",\n" +
              "                    \"icon\": \"10d\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 92\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 3.22,\n" +
              "                \"deg\": 75.0005\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 2\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"d\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-27 09:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409140800,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 285.82,\n" +
              "                \"temp_min\": 285.625,\n" +
              "                \"temp_max\": 285.82,\n" +
              "                \"pressure\": 982.83,\n" +
              "                \"sea_level\": 1021.9,\n" +
              "                \"grnd_level\": 982.83,\n" +
              "                \"humidity\": 100,\n" +
              "                \"temp_kf\": 0.19\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 501,\n" +
              "                    \"main\": \"Rain\",\n" +
              "                    \"description\": \"moderate rain\",\n" +
              "                    \"icon\": \"10d\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 92\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 5.12,\n" +
              "                \"deg\": 36.0015\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 6\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"d\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-27 12:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409151600,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 283.87,\n" +
              "                \"temp_min\": 283.697,\n" +
              "                \"temp_max\": 283.87,\n" +
              "                \"pressure\": 984.24,\n" +
              "                \"sea_level\": 1023.31,\n" +
              "                \"grnd_level\": 984.24,\n" +
              "                \"humidity\": 97,\n" +
              "                \"temp_kf\": 0.18\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 501,\n" +
              "                    \"main\": \"Rain\",\n" +
              "                    \"description\": \"moderate rain\",\n" +
              "                    \"icon\": \"10d\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 92\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 5.01,\n" +
              "                \"deg\": 23.0011\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 4\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"d\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-27 15:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409162400,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 283.7,\n" +
              "                \"temp_min\": 283.542,\n" +
              "                \"temp_max\": 283.7,\n" +
              "                \"pressure\": 986.66,\n" +
              "                \"sea_level\": 1025.83,\n" +
              "                \"grnd_level\": 986.66,\n" +
              "                \"humidity\": 97,\n" +
              "                \"temp_kf\": 0.16\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 500,\n" +
              "                    \"main\": \"Rain\",\n" +
              "                    \"description\": \"light rain\",\n" +
              "                    \"icon\": \"10n\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 92\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 2.55,\n" +
              "                \"deg\": 281.511\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 2\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"n\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-27 18:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409173200,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 283.83,\n" +
              "                \"temp_min\": 283.684,\n" +
              "                \"temp_max\": 283.83,\n" +
              "                \"pressure\": 987.62,\n" +
              "                \"sea_level\": 1027.16,\n" +
              "                \"grnd_level\": 987.62,\n" +
              "                \"humidity\": 96,\n" +
              "                \"temp_kf\": 0.14\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 802,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"scattered clouds\",\n" +
              "                    \"icon\": \"03n\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 32\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 4.01,\n" +
              "                \"deg\": 271.001\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"n\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-27 21:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409184000,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 282.83,\n" +
              "                \"temp_min\": 282.698,\n" +
              "                \"temp_max\": 282.83,\n" +
              "                \"pressure\": 988.16,\n" +
              "                \"sea_level\": 1027.78,\n" +
              "                \"grnd_level\": 988.16,\n" +
              "                \"humidity\": 96,\n" +
              "                \"temp_kf\": 0.13\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 500,\n" +
              "                    \"main\": \"Rain\",\n" +
              "                    \"description\": \"light rain\",\n" +
              "                    \"icon\": \"10n\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 32\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 4.27,\n" +
              "                \"deg\": 268.003\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 1\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"n\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-28 00:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409194800,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 282.1,\n" +
              "                \"temp_min\": 281.988,\n" +
              "                \"temp_max\": 282.1,\n" +
              "                \"pressure\": 988.79,\n" +
              "                \"sea_level\": 1028.39,\n" +
              "                \"grnd_level\": 988.79,\n" +
              "                \"humidity\": 94,\n" +
              "                \"temp_kf\": 0.11\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 801,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"few clouds\",\n" +
              "                    \"icon\": \"02n\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 12\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 4.52,\n" +
              "                \"deg\": 278.005\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"n\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-28 03:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409205600,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 284.41,\n" +
              "                \"temp_min\": 284.313,\n" +
              "                \"temp_max\": 284.41,\n" +
              "                \"pressure\": 989.94,\n" +
              "                \"sea_level\": 1029.38,\n" +
              "                \"grnd_level\": 989.94,\n" +
              "                \"humidity\": 96,\n" +
              "                \"temp_kf\": 0.1\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 802,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"scattered clouds\",\n" +
              "                    \"icon\": \"03d\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 44\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 4.11,\n" +
              "                \"deg\": 277.503\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"d\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-28 06:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409216400,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 288.59,\n" +
              "                \"temp_min\": 288.505,\n" +
              "                \"temp_max\": 288.59,\n" +
              "                \"pressure\": 990.69,\n" +
              "                \"sea_level\": 1029.79,\n" +
              "                \"grnd_level\": 990.69,\n" +
              "                \"humidity\": 85,\n" +
              "                \"temp_kf\": 0.08\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 801,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"few clouds\",\n" +
              "                    \"icon\": \"02d\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 24\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 4.46,\n" +
              "                \"deg\": 275.503\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"d\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-28 09:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409227200,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 288.96,\n" +
              "                \"temp_min\": 288.891,\n" +
              "                \"temp_max\": 288.96,\n" +
              "                \"pressure\": 990.5,\n" +
              "                \"sea_level\": 1029.57,\n" +
              "                \"grnd_level\": 990.5,\n" +
              "                \"humidity\": 79,\n" +
              "                \"temp_kf\": 0.06\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 802,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"scattered clouds\",\n" +
              "                    \"icon\": \"03d\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 36\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 4.67,\n" +
              "                \"deg\": 286.502\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"d\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-28 12:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409238000,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 290.22,\n" +
              "                \"temp_min\": 290.168,\n" +
              "                \"temp_max\": 290.22,\n" +
              "                \"pressure\": 990.28,\n" +
              "                \"sea_level\": 1029.3,\n" +
              "                \"grnd_level\": 990.28,\n" +
              "                \"humidity\": 71,\n" +
              "                \"temp_kf\": 0.05\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 803,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"broken clouds\",\n" +
              "                    \"icon\": \"04d\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 64\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 4.38,\n" +
              "                \"deg\": 267.501\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"d\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-28 15:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409248800,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 286.37,\n" +
              "                \"temp_min\": 286.342,\n" +
              "                \"temp_max\": 286.37,\n" +
              "                \"pressure\": 990.55,\n" +
              "                \"sea_level\": 1029.68,\n" +
              "                \"grnd_level\": 990.55,\n" +
              "                \"humidity\": 81,\n" +
              "                \"temp_kf\": 0.03\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 801,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"few clouds\",\n" +
              "                    \"icon\": \"02n\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 12\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 2.56,\n" +
              "                \"deg\": 255.512\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"n\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-28 18:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409259600,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 282.39,\n" +
              "                \"temp_min\": 282.376,\n" +
              "                \"temp_max\": 282.39,\n" +
              "                \"pressure\": 990.78,\n" +
              "                \"sea_level\": 1030.26,\n" +
              "                \"grnd_level\": 990.78,\n" +
              "                \"humidity\": 88,\n" +
              "                \"temp_kf\": 0.02\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 802,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"scattered clouds\",\n" +
              "                    \"icon\": \"03n\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 44\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 1.62,\n" +
              "                \"deg\": 245.502\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"n\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-28 21:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409270400,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 281.774,\n" +
              "                \"temp_min\": 281.774,\n" +
              "                \"temp_max\": 281.774,\n" +
              "                \"pressure\": 990.86,\n" +
              "                \"sea_level\": 1030.31,\n" +
              "                \"grnd_level\": 990.86,\n" +
              "                \"humidity\": 89\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 802,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"scattered clouds\",\n" +
              "                    \"icon\": \"03n\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 48\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 1.2,\n" +
              "                \"deg\": 183.003\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"n\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-29 00:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409281200,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 280.995,\n" +
              "                \"temp_min\": 280.995,\n" +
              "                \"temp_max\": 280.995,\n" +
              "                \"pressure\": 990.04,\n" +
              "                \"sea_level\": 1029.76,\n" +
              "                \"grnd_level\": 990.04,\n" +
              "                \"humidity\": 91\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 801,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"few clouds\",\n" +
              "                    \"icon\": \"02n\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 20\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 1.26,\n" +
              "                \"deg\": 138.002\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"n\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-29 03:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409292000,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 285.433,\n" +
              "                \"temp_min\": 285.433,\n" +
              "                \"temp_max\": 285.433,\n" +
              "                \"pressure\": 990.1,\n" +
              "                \"sea_level\": 1029.4,\n" +
              "                \"grnd_level\": 990.1,\n" +
              "                \"humidity\": 87\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 802,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"scattered clouds\",\n" +
              "                    \"icon\": \"03d\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 48\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 1.51,\n" +
              "                \"deg\": 138.504\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"d\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-29 06:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409302800,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 290.347,\n" +
              "                \"temp_min\": 290.347,\n" +
              "                \"temp_max\": 290.347,\n" +
              "                \"pressure\": 989.96,\n" +
              "                \"sea_level\": 1028.96,\n" +
              "                \"grnd_level\": 989.96,\n" +
              "                \"humidity\": 74\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 803,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"broken clouds\",\n" +
              "                    \"icon\": \"04d\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 64\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 2.21,\n" +
              "                \"deg\": 172.502\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"d\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-29 09:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409313600,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 293.387,\n" +
              "                \"temp_min\": 293.387,\n" +
              "                \"temp_max\": 293.387,\n" +
              "                \"pressure\": 988.83,\n" +
              "                \"sea_level\": 1027.66,\n" +
              "                \"grnd_level\": 988.83,\n" +
              "                \"humidity\": 69\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 801,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"few clouds\",\n" +
              "                    \"icon\": \"02d\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 12\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 2.46,\n" +
              "                \"deg\": 201.501\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"d\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-29 12:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409324400,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 289.946,\n" +
              "                \"temp_min\": 289.946,\n" +
              "                \"temp_max\": 289.946,\n" +
              "                \"pressure\": 988.23,\n" +
              "                \"sea_level\": 1027.06,\n" +
              "                \"grnd_level\": 988.23,\n" +
              "                \"humidity\": 96\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 500,\n" +
              "                    \"main\": \"Rain\",\n" +
              "                    \"description\": \"light rain\",\n" +
              "                    \"icon\": \"10d\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 92\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 2.86,\n" +
              "                \"deg\": 218.002\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 2\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"d\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-29 15:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409335200,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 289.032,\n" +
              "                \"temp_min\": 289.032,\n" +
              "                \"temp_max\": 289.032,\n" +
              "                \"pressure\": 987.87,\n" +
              "                \"sea_level\": 1026.93,\n" +
              "                \"grnd_level\": 987.87,\n" +
              "                \"humidity\": 96\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 500,\n" +
              "                    \"main\": \"Rain\",\n" +
              "                    \"description\": \"light rain\",\n" +
              "                    \"icon\": \"10n\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 92\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 5.42,\n" +
              "                \"deg\": 243.511\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 2\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"n\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-29 18:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409346000,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 287.565,\n" +
              "                \"temp_min\": 287.565,\n" +
              "                \"temp_max\": 287.565,\n" +
              "                \"pressure\": 989.06,\n" +
              "                \"sea_level\": 1028.11,\n" +
              "                \"grnd_level\": 989.06,\n" +
              "                \"humidity\": 95\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 500,\n" +
              "                    \"main\": \"Rain\",\n" +
              "                    \"description\": \"light rain\",\n" +
              "                    \"icon\": \"10n\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 48\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 6.77,\n" +
              "                \"deg\": 277.501\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 1\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"n\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-29 21:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409356800,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 285.405,\n" +
              "                \"temp_min\": 285.405,\n" +
              "                \"temp_max\": 285.405,\n" +
              "                \"pressure\": 989.38,\n" +
              "                \"sea_level\": 1028.67,\n" +
              "                \"grnd_level\": 989.38,\n" +
              "                \"humidity\": 92\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 803,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"broken clouds\",\n" +
              "                    \"icon\": \"04n\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 56\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 5.8,\n" +
              "                \"deg\": 282.001\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"n\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-30 00:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409367600,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 284.114,\n" +
              "                \"temp_min\": 284.114,\n" +
              "                \"temp_max\": 284.114,\n" +
              "                \"pressure\": 989.86,\n" +
              "                \"sea_level\": 1029.15,\n" +
              "                \"grnd_level\": 989.86,\n" +
              "                \"humidity\": 95\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 801,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"few clouds\",\n" +
              "                    \"icon\": \"02n\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 20\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 5.11,\n" +
              "                \"deg\": 284.002\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"n\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-30 03:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409378400,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 285.294,\n" +
              "                \"temp_min\": 285.294,\n" +
              "                \"temp_max\": 285.294,\n" +
              "                \"pressure\": 990.22,\n" +
              "                \"sea_level\": 1029.5,\n" +
              "                \"grnd_level\": 990.22,\n" +
              "                \"humidity\": 93\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 803,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"broken clouds\",\n" +
              "                    \"icon\": \"04d\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 68\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 4.32,\n" +
              "                \"deg\": 271.01\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"d\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-30 06:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409389200,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 287.485,\n" +
              "                \"temp_min\": 287.485,\n" +
              "                \"temp_max\": 287.485,\n" +
              "                \"pressure\": 990.83,\n" +
              "                \"sea_level\": 1029.88,\n" +
              "                \"grnd_level\": 990.83,\n" +
              "                \"humidity\": 85\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 804,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"overcast clouds\",\n" +
              "                    \"icon\": \"04d\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 92\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 4.55,\n" +
              "                \"deg\": 270.001\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"d\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-30 09:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409400000,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 288.499,\n" +
              "                \"temp_min\": 288.499,\n" +
              "                \"temp_max\": 288.499,\n" +
              "                \"pressure\": 990.96,\n" +
              "                \"sea_level\": 1029.89,\n" +
              "                \"grnd_level\": 990.96,\n" +
              "                \"humidity\": 79\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 804,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"overcast clouds\",\n" +
              "                    \"icon\": \"04d\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 92\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 4.31,\n" +
              "                \"deg\": 270.511\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"d\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-30 12:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409410800,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 289.904,\n" +
              "                \"temp_min\": 289.904,\n" +
              "                \"temp_max\": 289.904,\n" +
              "                \"pressure\": 990.16,\n" +
              "                \"sea_level\": 1029.06,\n" +
              "                \"grnd_level\": 990.16,\n" +
              "                \"humidity\": 74\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 800,\n" +
              "                    \"main\": \"Clear\",\n" +
              "                    \"description\": \"sky is clear\",\n" +
              "                    \"icon\": \"02d\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 8\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 3.35,\n" +
              "                \"deg\": 256.502\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"d\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-30 15:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409421600,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 285.899,\n" +
              "                \"temp_min\": 285.899,\n" +
              "                \"temp_max\": 285.899,\n" +
              "                \"pressure\": 989.91,\n" +
              "                \"sea_level\": 1029.04,\n" +
              "                \"grnd_level\": 989.91,\n" +
              "                \"humidity\": 86\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 800,\n" +
              "                    \"main\": \"Clear\",\n" +
              "                    \"description\": \"sky is clear\",\n" +
              "                    \"icon\": \"01n\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 0\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 1.92,\n" +
              "                \"deg\": 229.501\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"n\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-30 18:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409432400,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 281.978,\n" +
              "                \"temp_min\": 281.978,\n" +
              "                \"temp_max\": 281.978,\n" +
              "                \"pressure\": 989.82,\n" +
              "                \"sea_level\": 1029.35,\n" +
              "                \"grnd_level\": 989.82,\n" +
              "                \"humidity\": 87\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 800,\n" +
              "                    \"main\": \"Clear\",\n" +
              "                    \"description\": \"sky is clear\",\n" +
              "                    \"icon\": \"01n\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 0\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 1.66,\n" +
              "                \"deg\": 211.506\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"n\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-30 21:00:00\"\n" +
              "        },\n" +
              "        {\n" +
              "            \"dt\": 1409443200,\n" +
              "            \"main\": {\n" +
              "                \"temp\": 279.985,\n" +
              "                \"temp_min\": 279.985,\n" +
              "                \"temp_max\": 279.985,\n" +
              "                \"pressure\": 989.58,\n" +
              "                \"sea_level\": 1029.1,\n" +
              "                \"grnd_level\": 989.58,\n" +
              "                \"humidity\": 83\n" +
              "            },\n" +
              "            \"weather\": [\n" +
              "                {\n" +
              "                    \"id\": 801,\n" +
              "                    \"main\": \"Clouds\",\n" +
              "                    \"description\": \"few clouds\",\n" +
              "                    \"icon\": \"02n\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"clouds\": {\n" +
              "                \"all\": 12\n" +
              "            },\n" +
              "            \"wind\": {\n" +
              "                \"speed\": 1.26,\n" +
              "                \"deg\": 152.001\n" +
              "            },\n" +
              "            \"rain\": {\n" +
              "                \"3h\": 0\n" +
              "            },\n" +
              "            \"sys\": {\n" +
              "                \"pod\": \"n\"\n" +
              "            },\n" +
              "            \"dt_txt\": \"2014-08-31 00:00:00\"\n" +
              "        }\n" +
              "    ]\n" +
              "\n" +
              "}");
    } catch (JSONException e) {
      e.printStackTrace();
    }
    return null;
  }
}
