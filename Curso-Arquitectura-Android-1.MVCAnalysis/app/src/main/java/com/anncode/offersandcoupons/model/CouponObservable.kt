package com.anncode.offersandcoupons.model

import androidx.databinding.BaseObservable
import androidx.lifecycle.MutableLiveData
import com.anncode.offersandcoupons.view.RecyclerCouponsAdapter

class CouponObservable: BaseObservable() {

    private var couponRepository: CouponRepository = CouponRepositoryImpl()
    private var recyclerCouponsAdapter: RecyclerCouponsAdapter? = null

    //Repositorio
    fun callCoupons(){
        couponRepository.callCoupunsAPI()
    }

    //ViewModel
    fun getCoupons() : MutableLiveData<List<Coupon>> {
        return couponRepository.getCoupuns()
    }

    fun setCouponInRecyclerAdapter(coupons: List<Coupon>){

    }
}