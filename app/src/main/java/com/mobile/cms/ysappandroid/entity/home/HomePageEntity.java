package com.mobile.cms.ysappandroid.entity.home;

import java.util.List;

/**
 * Created by yangang on 2018/1/19.
 */

public class HomePageEntity {

    /**
     * slide_list : [{"id":"8361","title":"爱上蒲女团：终章","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G049343118.jpg"},{"id":"8140","title":"银翼杀手2049 国语版","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180108/1_010Q355014957.jpg"},{"id":"6855","title":"烽火丽人","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/171029/1_1029142Z34327.jpg"},{"id":"7715","title":"丛林","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/171113/1_1113194509A18.jpg"},{"id":"8541","title":"花谢花飞花满天","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G12G4D43.jpg"}]
     * move_list : {"data":[{"id":"8361","title":"爱上蒲女团：终章","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G049343118.jpg"},{"id":"8140","title":"银翼杀手2049 国语版","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180108/1_010Q355014957.jpg"},{"id":"6855","title":"烽火丽人","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/171029/1_1029142Z34327.jpg"},{"id":"7715","title":"丛林","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/171113/1_1113194509A18.jpg"},{"id":"8382","title":"都厅爆炸！","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G04941B95.jpg"},{"id":"8389","title":"耍宝太君2","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G049452607.jpg"}],"title":"热播电影"}
     * tv_list : {"data":[{"id":"8541","title":"花谢花飞花满天","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G12G4D43.jpg"},{"id":"8540","title":"红蔷薇","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G12G314P.jpg"},{"id":"8539","title":"风筝","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G12G2ZX.jpg"},{"id":"8537","title":"最好的安排","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G12G12236.jpg"},{"id":"8538","title":"第一声枪响","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G12G1MS.jpg"},{"id":"8535","title":"艳骨","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G12G04003.jpg"}],"title":"热播电视剧"}
     * arts_list : {"data":[{"id":"8416","title":"新娱乐在线","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G119192Y2.jpg"},{"id":"8415","title":"舌尖上的中国 第二季","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G1191a295.jpg"},{"id":"8414","title":"王者出击","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G1191SH0.jpg"},{"id":"8413","title":"舌尖上的中国 第一季","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G1191QW2.jpg"},{"id":"8410","title":"冒犯家族","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G1191J105.jpg"},{"id":"8411","title":"穿越吧","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G1191JL6.jpg"}],"title":"综艺"}
     * comic_list : {"data":[{"id":"8445","title":"武庚纪 第二季","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G123524194.jpg"},{"id":"8444","title":"逆光之颤","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G123519633.jpg"},{"id":"8443","title":"三丽鸥男子","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G123515C7.jpg"},{"id":"8442","title":"枪神记","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G123515O2.jpg"},{"id":"8441","title":"权力的游戏：征服与反抗","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G123505349.jpg"},{"id":"8440","title":"柑橘味香气","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G12350R45.jpg"}],"title":"动漫"}
     * korean_iist : {"data":[{"id":"6432","title":"达顺的春天","litpic":"https:"},{"id":"6431","title":"遗留搜查 第四季","litpic":"https:"},{"id":"6430","title":"植木等和热血小青年","litpic":"https:"},{"id":"6429","title":"我是山岸，有何贵干","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/170909/1_0Z915464AD0.jpg"},{"id":"6428","title":"伊藤君A到E","litpic":"https:"},{"id":"6427","title":"无理的李英爱 系列12","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/170909/1_0Z9154645FY.jpg"}],"title":"韩剧"}
     */

    public DataListBean move_list;
    public DataListBean tv_list;
    public DataListBean arts_list;
    public DataListBean comic_list;
    public DataListBean korean_iist;
    public List<SlideListBean> slide_list;

    public static class DataListBean {
        /**
         * data : [{"id":"8361","title":"爱上蒲女团：终章","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G049343118.jpg"},{"id":"8140","title":"银翼杀手2049 国语版","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180108/1_010Q355014957.jpg"},{"id":"6855","title":"烽火丽人","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/171029/1_1029142Z34327.jpg"},{"id":"7715","title":"丛林","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/171113/1_1113194509A18.jpg"},{"id":"8382","title":"都厅爆炸！","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G04941B95.jpg"},{"id":"8389","title":"耍宝太君2","litpic":"https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G049452607.jpg"}]
         * title : 热播电影
         */

        public String title;
        public List<DataBean> data;

        public static class DataBean {
            /**
             * id : 8361
             * title : 爱上蒲女团：终章
             * litpic : https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G049343118.jpg
             */

            public String id;
            public String title;
            public String litpic;
        }
    }


    public static class SlideListBean {
        /**
         * id : 8361
         * title : 爱上蒲女团：终章
         * litpic : https://www.guaiguaiyingshi.com/uploads/allimg/180107/1_010G049343118.jpg
         */

        public String id;
        public String title;
        public String litpic;
    }
}
