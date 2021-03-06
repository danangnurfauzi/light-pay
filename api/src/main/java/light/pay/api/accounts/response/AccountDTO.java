package light.pay.api.accounts.response;

import com.google.gson.annotations.SerializedName;
import light.pay.api.accounts.UserType;
import lombok.Builder;
import lombok.Value;
import lombok.With;

@Value
@Builder
public class AccountDTO {
    @With
    @SerializedName("user_id")
    private String userID;
    private String name;
    private String email;
    private String phoneNumber;
    private boolean active;
    @With
    @SerializedName("user_type")
    private UserType userType;
}
