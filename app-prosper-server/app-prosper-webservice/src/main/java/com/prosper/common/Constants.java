package com.prosper.common;

/**
 * 公共类
 */
public class Constants {
    /**
     * WS 报文常量定义
     */
    public static class WsMsg {
        //消息类型
        public static final String messagetype = "SALESDATA";
        //消息ID
        public static final String messageid = "332";
        //版本编号
        public static final String version = "V332M";
        //商场编号
        public static final String mallid = "GG66";
        //收银机号
        public static final String tillid = "01";
        //店铺号
        public static final String storecode = "311005";
        //货号
        public static final String mallitemcode = "3110050001";
        // 是否专柜货号
        public static final String iscounteritemcode = "1";
    }

    /**
     * 销售类型枚举
     */
    public enum SalesType {
        /**
         * 卖
         */
        SELL("SA"),
        /**
         * 退货/取消
         */
        RETREAT("SR");

        private String value;

        SalesType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public static Constants.SalesType getSalesType(int snb) {
            Constants.SalesType item = SalesType.SELL;
            if (snb < 0) {
                item = SalesType.RETREAT;
            }
            return item;
        }
    }

    /**
     * 付款方式
     */
    public enum PayWay {
        //实销，OH----其他付款方式
        PayWay00("00", "OH"),
        //现金，CH----现金
        PayWay01("01", "CH"),
        //银行卡，EN----国内银行卡
        PayWay02("02", "EN"),
        //信用卡，EN----国内银行卡
        PayWay03("03", "EN"),
        //代金券，OH----其他付款方式
        PayWay04("04", "OH"),
        //自有储值卡，OH----其他付款方式
        PayWay05("05", "OH"),
        //积分抵现，OH----其他付款方式
        PayWay06("06", "OH"),
        //其他收款，OH----其他付款方式
        PayWay07("07", "OH"),
        //支付宝，XI----支付宝支付
        PayWay08("08", "XI"),
        //优惠券，XI----支付宝支付
        PayWay09("09", "OH"),
        //微信，XF----微信支付
        PayWay10("10", "XF"),
        //虚销，OH----其他付款方式
        PayWay11("11", "OH"),
        //网银支付，OH----其他付款方式
        PayWay12("12", "OH"),
        //京东在线，OH----其他付款方式
        PayWay13("13", "OH"),
        //货到付款，OH----其他付款方式
        PayWay14("14", "OH"),
        //平台货币，OH----其他付款方式
        PayWay15("15", "OH"),
        //百度，OH----其他付款方式
        PayWay16("16", "OH"),
        //其它，OH----其他付款方式
        PayWay17("17", "OH"),
        //代付，OH----其他付款方式
        PayWay18("18", "OH"),
        //支付宝优惠券，OH----其他付款方式
        PayWay19("19", "OH");

        private String payWay;

        private String wsPayWay;

        PayWay(String payWay, String wsPayWay) {
            this.payWay = payWay;
            this.wsPayWay = wsPayWay;
        }

        public String getPayWay() {
            return payWay;
        }

        public String getWsPayWay() {
            return wsPayWay;
        }

        /**
         * 根据浪沙支付方式获取结果
         *
         * @param payWay
         * @return
         */
        public static Constants.PayWay getBeanByPayWay(String payWay) {
            Constants.PayWay item = Constants.PayWay.PayWay00;
            for (Constants.PayWay bean : Constants.PayWay.values()) {
                if (!bean.getPayWay().equals(payWay)) continue;
                item = bean;
                break;
            }
            return item;
        }
    }
}
