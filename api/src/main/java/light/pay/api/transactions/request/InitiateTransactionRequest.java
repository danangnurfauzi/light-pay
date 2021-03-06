package light.pay.api.transactions.request;

import com.google.gson.annotations.SerializedName;
import light.pay.api.accounts.UserType;
import light.pay.api.transactions.TransactionType;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class InitiateTransactionRequest {
    @SerializedName("transaction_id")
    private String transactionID;

    @SerializedName("reference_id")
    private String referenceID;

    @SerializedName("credited_wallet")
    private String creditedWallet;

    @SerializedName("debited_wallet")
    private String debitedWallet;

    private String description;

    private Long amount;

    @SerializedName("transaction_type")
    private TransactionType transactionType;
}
