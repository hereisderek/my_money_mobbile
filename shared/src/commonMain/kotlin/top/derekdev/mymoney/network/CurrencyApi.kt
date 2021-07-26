package top.derekdev.mymoney.network


/**
 * Created by Derek Zhu on 25/7/21.
 * Project: My_Money
 *
 */

// http://api.currencylayer.com/live?access_key=0d3e87d04ee2ec7cc7b735e002fa8106&currencies=USD,AUD,CAD,PLN,MXN,EUR&format=1
interface CurrencyApi {
    fun exchange(from: String, to: String, unit: Float) : Float
}
