package com.example.text.bean;

import java.util.List;

public class ModelData {

    /**
     * code : 200
     * msg : 知识点/杯赛知识点列表
     * data : [{"id":39,"parent_id":5,"type_name":"应用题","type_id":39,"type_name_one":"一年级知识点","amount":9,"knowledge_list":[{"id":285,"k_name":"巧移物体","k_img":"http://img2020.cn-sh2.ufileos.com/5e942134dc9219256.png?UCloudPublicKey=TOKEN_d93aafe8-130f-42a4-93f9-67851c1d5b0e&Signature=1AzbTznqSCxn5e7hHrgoNlnxjZo%3D","diff_star":1,"is_finish":0,"finish_plan":0,"is_new":1,"type_id":39,"k_type":"应用题","bfb":0,"allamount":0,"allexamount":0},{"id":302,"k_name":"摸彩球","k_img":"http://img2020.cn-sh2.ufileos.com/5e9422179c3554204.png?UCloudPublicKey=TOKEN_d93aafe8-130f-42a4-93f9-67851c1d5b0e&Signature=4QZM9J1Fa%2FmbcLt%2B3EEjaCbJm74%3D","diff_star":1,"is_finish":0,"finish_plan":0,"is_new":1,"type_id":39,"k_type":"应用题","bfb":0,"allamount":0,"allexamount":0},{"id":278,"k_name":"间隔之谜","k_img":"http://img2020.cn-sh2.ufileos.com/5e9420ab8bef72731.png?UCloudPublicKey=TOKEN_d93aafe8-130f-42a4-93f9-67851c1d5b0e&Signature=%2F%2F5TXD0KYzWK6dyGfJS01Op0ZzI%3D","diff_star":1,"is_finish":0,"finish_plan":0,"is_new":1,"type_id":39,"k_type":"应用题","bfb":0,"allamount":0,"allexamount":0},{"id":280,"k_name":"有趣的排队","k_img":"http://img2020.cn-sh2.ufileos.com/5e9421019006e1053.png?UCloudPublicKey=TOKEN_d93aafe8-130f-42a4-93f9-67851c1d5b0e&Signature=tN60WHb2SBvY6nxvAKLWu7Eo530%3D","diff_star":1,"is_finish":0,"finish_plan":0,"is_new":1,"type_id":39,"k_type":"应用题","bfb":0,"allamount":0,"allexamount":0},{"id":279,"k_name":"认识长度","k_img":"http://img2020.cn-sh2.ufileos.com/5e9420f6e00532039.png?UCloudPublicKey=TOKEN_d93aafe8-130f-42a4-93f9-67851c1d5b0e&Signature=rg9eCXVzD%2BL0R%2ByyZB2oMg1w5Xc%3D","diff_star":1,"is_finish":0,"finish_plan":0,"is_new":1,"type_id":39,"k_type":"应用题","bfb":0,"allamount":0,"allexamount":0},{"id":284,"k_name":"认识人民币","k_img":"http://img2020.cn-sh2.ufileos.com/5e94212a1fa951756.png?UCloudPublicKey=TOKEN_d93aafe8-130f-42a4-93f9-67851c1d5b0e&Signature=7TmicmYimsAsK%2FhWJ2AiAPM%2FXRw%3D","diff_star":1,"is_finish":0,"finish_plan":0,"is_new":1,"type_id":39,"k_type":"应用题","bfb":0,"allamount":0,"allexamount":0},{"id":281,"k_name":"等量代换","k_img":"http://img2020.cn-sh2.ufileos.com/5e94210bbed206442.png?UCloudPublicKey=TOKEN_d93aafe8-130f-42a4-93f9-67851c1d5b0e&Signature=%2FTNKod1yiL2gE1qZR0NCYjD%2BiiU%3D","diff_star":1,"is_finish":0,"finish_plan":0,"is_new":1,"type_id":39,"k_type":"应用题","bfb":0,"allamount":0,"allexamount":0},{"id":303,"k_name":"认识重量","k_img":"http://img2020.cn-sh2.ufileos.com/5e9422212aeb32375.png?UCloudPublicKey=TOKEN_d93aafe8-130f-42a4-93f9-67851c1d5b0e&Signature=YcAp7FiZAsgqkjmlejPhaol9P%2BM%3D","diff_star":1,"is_finish":0,"finish_plan":0,"is_new":1,"type_id":39,"k_type":"应用题","bfb":0,"allamount":0,"allexamount":0},{"id":309,"k_name":"认识时间（1）","k_img":"http://img2020.cn-sh2.ufileos.com/5e94285bdcd271022.png?UCloudPublicKey=TOKEN_d93aafe8-130f-42a4-93f9-67851c1d5b0e&Signature=KEaEnSCJchvhjNvf8H%2BlHNVS0B8%3D","diff_star":1,"is_finish":0,"finish_plan":0,"is_new":1,"type_id":39,"k_type":"应用题","bfb":0,"allamount":0,"allexamount":0}]}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 39
         * parent_id : 5
         * type_name : 应用题
         * type_id : 39
         * type_name_one : 一年级知识点
         * amount : 9
         * knowledge_list : [{"id":285,"k_name":"巧移物体","k_img":"http://img2020.cn-sh2.ufileos.com/5e942134dc9219256.png?UCloudPublicKey=TOKEN_d93aafe8-130f-42a4-93f9-67851c1d5b0e&Signature=1AzbTznqSCxn5e7hHrgoNlnxjZo%3D","diff_star":1,"is_finish":0,"finish_plan":0,"is_new":1,"type_id":39,"k_type":"应用题","bfb":0,"allamount":0,"allexamount":0},{"id":302,"k_name":"摸彩球","k_img":"http://img2020.cn-sh2.ufileos.com/5e9422179c3554204.png?UCloudPublicKey=TOKEN_d93aafe8-130f-42a4-93f9-67851c1d5b0e&Signature=4QZM9J1Fa%2FmbcLt%2B3EEjaCbJm74%3D","diff_star":1,"is_finish":0,"finish_plan":0,"is_new":1,"type_id":39,"k_type":"应用题","bfb":0,"allamount":0,"allexamount":0},{"id":278,"k_name":"间隔之谜","k_img":"http://img2020.cn-sh2.ufileos.com/5e9420ab8bef72731.png?UCloudPublicKey=TOKEN_d93aafe8-130f-42a4-93f9-67851c1d5b0e&Signature=%2F%2F5TXD0KYzWK6dyGfJS01Op0ZzI%3D","diff_star":1,"is_finish":0,"finish_plan":0,"is_new":1,"type_id":39,"k_type":"应用题","bfb":0,"allamount":0,"allexamount":0},{"id":280,"k_name":"有趣的排队","k_img":"http://img2020.cn-sh2.ufileos.com/5e9421019006e1053.png?UCloudPublicKey=TOKEN_d93aafe8-130f-42a4-93f9-67851c1d5b0e&Signature=tN60WHb2SBvY6nxvAKLWu7Eo530%3D","diff_star":1,"is_finish":0,"finish_plan":0,"is_new":1,"type_id":39,"k_type":"应用题","bfb":0,"allamount":0,"allexamount":0},{"id":279,"k_name":"认识长度","k_img":"http://img2020.cn-sh2.ufileos.com/5e9420f6e00532039.png?UCloudPublicKey=TOKEN_d93aafe8-130f-42a4-93f9-67851c1d5b0e&Signature=rg9eCXVzD%2BL0R%2ByyZB2oMg1w5Xc%3D","diff_star":1,"is_finish":0,"finish_plan":0,"is_new":1,"type_id":39,"k_type":"应用题","bfb":0,"allamount":0,"allexamount":0},{"id":284,"k_name":"认识人民币","k_img":"http://img2020.cn-sh2.ufileos.com/5e94212a1fa951756.png?UCloudPublicKey=TOKEN_d93aafe8-130f-42a4-93f9-67851c1d5b0e&Signature=7TmicmYimsAsK%2FhWJ2AiAPM%2FXRw%3D","diff_star":1,"is_finish":0,"finish_plan":0,"is_new":1,"type_id":39,"k_type":"应用题","bfb":0,"allamount":0,"allexamount":0},{"id":281,"k_name":"等量代换","k_img":"http://img2020.cn-sh2.ufileos.com/5e94210bbed206442.png?UCloudPublicKey=TOKEN_d93aafe8-130f-42a4-93f9-67851c1d5b0e&Signature=%2FTNKod1yiL2gE1qZR0NCYjD%2BiiU%3D","diff_star":1,"is_finish":0,"finish_plan":0,"is_new":1,"type_id":39,"k_type":"应用题","bfb":0,"allamount":0,"allexamount":0},{"id":303,"k_name":"认识重量","k_img":"http://img2020.cn-sh2.ufileos.com/5e9422212aeb32375.png?UCloudPublicKey=TOKEN_d93aafe8-130f-42a4-93f9-67851c1d5b0e&Signature=YcAp7FiZAsgqkjmlejPhaol9P%2BM%3D","diff_star":1,"is_finish":0,"finish_plan":0,"is_new":1,"type_id":39,"k_type":"应用题","bfb":0,"allamount":0,"allexamount":0},{"id":309,"k_name":"认识时间（1）","k_img":"http://img2020.cn-sh2.ufileos.com/5e94285bdcd271022.png?UCloudPublicKey=TOKEN_d93aafe8-130f-42a4-93f9-67851c1d5b0e&Signature=KEaEnSCJchvhjNvf8H%2BlHNVS0B8%3D","diff_star":1,"is_finish":0,"finish_plan":0,"is_new":1,"type_id":39,"k_type":"应用题","bfb":0,"allamount":0,"allexamount":0}]
         */

        private int id;
        private int parent_id;
        private String type_name;
        private int type_id;
        private String type_name_one;
        private int amount;
        private List<KnowledgeListBean> knowledge_list;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getParent_id() {
            return parent_id;
        }

        public void setParent_id(int parent_id) {
            this.parent_id = parent_id;
        }

        public String getType_name() {
            return type_name;
        }

        public void setType_name(String type_name) {
            this.type_name = type_name;
        }

        public int getType_id() {
            return type_id;
        }

        public void setType_id(int type_id) {
            this.type_id = type_id;
        }

        public String getType_name_one() {
            return type_name_one;
        }

        public void setType_name_one(String type_name_one) {
            this.type_name_one = type_name_one;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public List<KnowledgeListBean> getKnowledge_list() {
            return knowledge_list;
        }

        public void setKnowledge_list(List<KnowledgeListBean> knowledge_list) {
            this.knowledge_list = knowledge_list;
        }

        public static class KnowledgeListBean {
            /**
             * id : 285
             * k_name : 巧移物体
             * k_img : http://img2020.cn-sh2.ufileos.com/5e942134dc9219256.png?UCloudPublicKey=TOKEN_d93aafe8-130f-42a4-93f9-67851c1d5b0e&Signature=1AzbTznqSCxn5e7hHrgoNlnxjZo%3D
             * diff_star : 1
             * is_finish : 0
             * finish_plan : 0
             * is_new : 1
             * type_id : 39
             * k_type : 应用题
             * bfb : 0
             * allamount : 0
             * allexamount : 0
             */

            private int id;
            private String k_name;
            private String k_img;
            private int diff_star;
            private int is_finish;
            private int finish_plan;
            private int is_new;
            private int type_id;
            private String k_type;
            private int bfb;
            private int allamount;
            private int allexamount;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getK_name() {
                return k_name;
            }

            public void setK_name(String k_name) {
                this.k_name = k_name;
            }

            public String getK_img() {
                return k_img;
            }

            public void setK_img(String k_img) {
                this.k_img = k_img;
            }

            public int getDiff_star() {
                return diff_star;
            }

            public void setDiff_star(int diff_star) {
                this.diff_star = diff_star;
            }

            public int getIs_finish() {
                return is_finish;
            }

            public void setIs_finish(int is_finish) {
                this.is_finish = is_finish;
            }

            public int getFinish_plan() {
                return finish_plan;
            }

            public void setFinish_plan(int finish_plan) {
                this.finish_plan = finish_plan;
            }

            public int getIs_new() {
                return is_new;
            }

            public void setIs_new(int is_new) {
                this.is_new = is_new;
            }

            public int getType_id() {
                return type_id;
            }

            public void setType_id(int type_id) {
                this.type_id = type_id;
            }

            public String getK_type() {
                return k_type;
            }

            public void setK_type(String k_type) {
                this.k_type = k_type;
            }

            public int getBfb() {
                return bfb;
            }

            public void setBfb(int bfb) {
                this.bfb = bfb;
            }

            public int getAllamount() {
                return allamount;
            }

            public void setAllamount(int allamount) {
                this.allamount = allamount;
            }

            public int getAllexamount() {
                return allexamount;
            }

            public void setAllexamount(int allexamount) {
                this.allexamount = allexamount;
            }
        }
    }
}
