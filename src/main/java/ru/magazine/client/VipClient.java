package ru.magazine.client;

public class VipClient extends BaseClient{

    private float sizeDiscount;

    private boolean checkDiscount() {
        return sizeDiscount > 0;
    }

    @Override
    public void buyGoods () {
        if(!checkDiscount()) {
            super.buyGoods();
        }else {

        }

    }
}


