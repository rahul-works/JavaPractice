package scalar_dp.designPattern.adapter;

import scalar_dp.designPattern.adapter.thirdparty.banks.ICICIApi;

public class ICICIBankAPIAdapter implements BankAPIAdapter{
    private ICICIApi iciciApi;

    public ICICIBankAPIAdapter() {
        this.iciciApi = new ICICIApi();
    }

    @Override
    public float checkBalance(String accountNo, String pin) {
        return 0;
    }

    @Override
    public boolean authenticate(String accountNo, String pin) {
        return false;
    }

    @Override
    public boolean transaction(String fromAccountNo, String toAccountNo) {
        return false;
    }
}
