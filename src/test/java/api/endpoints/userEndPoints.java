package api.endpoints;


import static io.restassured.RestAssured.given;

import api.payload.user;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class userEndPoints {


	public static Response createUser(user payload){

		Response response =given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.body(payload)

				.when()
				.post(Routes.post_url);

		return response;
	}

	public static Response getUser(String userName){

		Response response =given()
				.accept(ContentType.JSON)
				.pathParams("username",userName)

				.when()
				.get(Routes.get_url);
		return response;
	}

	public static Response updateUser(String userName ,user payload){

		Response response =given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.pathParams("username",userName)
				.body(payload)

				.when()
				.put(Routes.put_url);
		return response;
	}

	public static Response DeleteUser(String userName)
	{
		Response response = given()
				.accept(ContentType.JSON)
				.pathParam("username", userName)

				.when()
				.delete(Routes.del_url);

		return response;
	}
}



