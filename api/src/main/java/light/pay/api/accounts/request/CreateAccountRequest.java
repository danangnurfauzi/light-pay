package light.pay.api.accounts.request;

import com.google.gson.annotations.SerializedName;
import light.pay.api.accounts.UserType;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CreateAccountRequest {
    @SerializedName("user_id")
    private String userID;
    private String name;
    private String email;
    private String phoneNumber;
    @SerializedName("user_type")
    private UserType userType;
}
