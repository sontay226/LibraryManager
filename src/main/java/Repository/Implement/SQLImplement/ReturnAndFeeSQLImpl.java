package Repository.Implement.SQLImplement;

import Entities.Borrow;
import Entities.ReturnAndFee;
import Repository.Interface.IReturnAndFeeRepository;

public class ReturnAndFeeSQLImpl implements IReturnAndFeeRepository {

    @Override
    public double calLateFee(ReturnAndFee returnAndFee ) {
        return 0;
    }
}
