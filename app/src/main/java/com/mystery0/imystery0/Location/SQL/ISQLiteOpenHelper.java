package com.mystery0.imystery0.Location.SQL;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by myste on 2016-6-21-0021.
 * 执行sql语句建表
 */
public class ISQLiteOpenHelper extends SQLiteOpenHelper
{

    public ISQLiteOpenHelper(Context context, String name)
    {
        super(context, name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        putValue(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }

    private void putValue(SQLiteDatabase db)
    {
        db.execSQL(
                "CREATE TABLE city_list(ID VARCHAR(11) NOT NULL PRIMARY KEY,District VARCHAR(7) NOT NULL ,City VARCHAR(4) NOT NULL,Province VARCHAR(3) NOT NULL);");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101010100','北京','北京','北京');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101010200','海淀','北京','北京');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101010300','朝阳','北京','北京');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101010400','顺义','北京','北京');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101010500','怀柔','北京','北京');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101010600','通州','北京','北京');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101010700','昌平','北京','北京');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101010800','延庆','北京','北京');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101010900','丰台','北京','北京');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101011000','石景山','北京','北京');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101011100','大兴','北京','北京');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101011200','房山','北京','北京');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101011300','密云','北京','北京');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101011400','门头沟','北京','北京');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101011500','平谷','北京','北京');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101020100','上海','上海','上海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101020200','闵行','上海','上海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101020300','宝山','上海','上海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101020500','嘉定','上海','上海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101020600','浦东南汇','上海','上海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101020700','金山','上海','上海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101020800','青浦','上海','上海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101020900','松江','上海','上海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101021000','奉贤','上海','上海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101021100','崇明','上海','上海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101021200','徐家汇','上海','上海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101021300','浦东','上海','上海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101030100','天津','天津','天津');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101030200','武清','天津','天津');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101030300','宝坻','天津','天津');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101030400','东丽','天津','天津');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101030500','西青','天津','天津');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101030600','北辰','天津','天津');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101030700','宁河','天津','天津');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101030800','汉沽','天津','天津');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101030900','静海','天津','天津');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101031000','津南','天津','天津');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101031100','塘沽','天津','天津');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101031200','大港','天津','天津');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101031400','蓟县','天津','天津');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101040100','重庆','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101040200','永川','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101040300','合川','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101040400','南川','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101040500','江津','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101040600','万盛','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101040700','渝北','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101040800','北碚','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101040900','巴南','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101041000','长寿','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101041100','黔江','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101041300','万州','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101041400','涪陵','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101041500','开县','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101041600','城口','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101041700','云阳','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101041800','巫溪','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101041900','奉节','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101042000','巫山','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101042100','潼南','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101042200','垫江','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101042300','梁平','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101042400','忠县','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101042500','石柱','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101042600','大足','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101042700','荣昌','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101042800','铜梁','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101042900','璧山','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101043000','丰都','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101043100','武隆','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101043200','彭水','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101043300','綦江','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101043400','酉阳','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101043600','秀山','重庆','重庆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050101','哈尔滨','哈尔滨','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050102','双城','哈尔滨','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050103','呼兰','哈尔滨','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050104','阿城','哈尔滨','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050105','宾县','哈尔滨','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050106','依兰','哈尔滨','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050107','巴彦','哈尔滨','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050108','通河','哈尔滨','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050109','方正','哈尔滨','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050110','延寿','哈尔滨','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050111','尚志','哈尔滨','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050112','五常','哈尔滨','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050113','木兰','哈尔滨','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050201','齐齐哈尔','齐齐哈尔','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050202','讷河','齐齐哈尔','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050203','龙江','齐齐哈尔','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050204','甘南','齐齐哈尔','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050205','富裕','齐齐哈尔','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050206','依安','齐齐哈尔','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050207','拜泉','齐齐哈尔','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050208','克山','齐齐哈尔','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050209','克东','齐齐哈尔','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050210','泰来','齐齐哈尔','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050301','牡丹江','牡丹江','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050302','海林','牡丹江','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050303','穆棱','牡丹江','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050304','林口','牡丹江','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050305','绥芬河','牡丹江','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050306','宁安','牡丹江','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050307','东宁','牡丹江','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050401','佳木斯','佳木斯','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050402','汤原','佳木斯','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050403','抚远','佳木斯','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050404','桦川','佳木斯','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050405','桦南','佳木斯','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050406','同江','佳木斯','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050407','富锦','佳木斯','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050501','绥化','绥化','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050502','肇东','绥化','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050503','安达','绥化','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050504','海伦','绥化','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050505','明水','绥化','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050506','望奎','绥化','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050507','兰西','绥化','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050508','青冈','绥化','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050509','庆安','绥化','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050510','绥棱','绥化','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050601','黑河','黑河','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050602','嫩江','黑河','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050603','孙吴','黑河','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050604','逊克','黑河','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050605','五大连池','黑河','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050606','北安','黑河','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050701','大兴安岭','大兴安岭','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050702','塔河','大兴安岭','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050703','漠河','大兴安岭','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050704','呼玛','大兴安岭','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050705','呼中','大兴安岭','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050706','新林','大兴安岭','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050708','加格达奇','大兴安岭','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050801','伊春','伊春','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050802','乌伊岭','伊春','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050803','五营','伊春','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050804','铁力','伊春','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050805','嘉荫','伊春','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050901','大庆','大庆','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050902','林甸','大庆','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050903','肇州','大庆','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050904','肇源','大庆','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101050905','杜尔伯特','大庆','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101051002','七台河','七台河','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101051003','勃利','七台河','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101051101','鸡西','鸡西','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101051102','虎林','鸡西','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101051103','密山','鸡西','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101051104','鸡东','鸡西','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101051201','鹤岗','鹤岗','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101051202','绥滨','鹤岗','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101051203','萝北','鹤岗','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101051301','双鸭山','双鸭山','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101051302','集贤','双鸭山','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101051303','宝清','双鸭山','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101051304','饶河','双鸭山','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101051305','友谊','双鸭山','黑龙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060101','长春','长春','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060102','农安','长春','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060103','德惠','长春','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060104','九台','长春','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060105','榆树','长春','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060106','双阳','长春','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060201','吉林','吉林','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060202','舒兰','吉林','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060203','永吉','吉林','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060204','蛟河','吉林','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060205','磐石','吉林','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060206','桦甸','吉林','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060301','延吉','延边','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060302','敦化','延边','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060303','安图','延边','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060304','汪清','延边','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060305','和龙','延边','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060307','龙井','延边','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060308','珲春','延边','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060309','图们','延边','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060401','四平','四平','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060402','双辽','四平','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060403','梨树','四平','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060404','公主岭','四平','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060405','伊通','四平','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060501','通化','通化','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060502','梅河口','通化','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060503','柳河','通化','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060504','辉南','通化','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060505','集安','通化','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060506','通化县','通化','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060601','白城','白城','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060602','洮南','白城','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060603','大安','白城','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060604','镇赉','白城','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060605','通榆','白城','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060701','辽源','辽源','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060702','东丰','辽源','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060703','东辽','辽源','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060801','松原','松原','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060802','乾安','松原','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060803','前郭','松原','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060804','长岭','松原','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060805','扶余','松原','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060901','白山','白山','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060902','靖宇','白山','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060903','临江','白山','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060904','东岗','白山','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060905','长白','白山','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060906','抚松','白山','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101060907','江源','白山','吉林');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070101','沈阳','沈阳','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070103','辽中','沈阳','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070104','康平','沈阳','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070105','法库','沈阳','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070106','新民','沈阳','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070201','大连','大连','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070202','瓦房店','大连','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070203','金州','大连','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070204','普兰店','大连','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070205','旅顺','大连','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070206','长海','大连','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070207','庄河','大连','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070301','鞍山','鞍山','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070302','台安','鞍山','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070303','岫岩','鞍山','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070304','海城','鞍山','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070401','抚顺','抚顺','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070402','新宾','抚顺','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070403','清原','抚顺','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070404','章党','抚顺','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070501','本溪','本溪','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070502','本溪县','本溪','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070504','桓仁','本溪','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070601','丹东','丹东','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070602','凤城','丹东','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070603','宽甸','丹东','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070604','东港','丹东','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070701','锦州','锦州','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070702','凌海','锦州','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070704','义县','锦州','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070705','黑山','锦州','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070706','北镇','锦州','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070801','营口','营口','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070802','大石桥','营口','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070803','盖州','营口','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070901','阜新','阜新','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101070902','彰武','阜新','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101071001','辽阳','辽阳','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101071002','辽阳县','辽阳','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101071003','灯塔','辽阳','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101071004','弓长岭','辽阳','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101071101','铁岭','铁岭','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101071102','开原','铁岭','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101071103','昌图','铁岭','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101071104','西丰','铁岭','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101071105','调兵山','铁岭','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101071201','朝阳','朝阳','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101071203','凌源','朝阳','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101071204','喀左','朝阳','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101071205','北票','朝阳','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101071207','建平县','朝阳','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101071301','盘锦','盘锦','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101071302','大洼','盘锦','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101071303','盘山','盘锦','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101071401','葫芦岛','葫芦岛','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101071402','建昌','葫芦岛','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101071403','绥中','葫芦岛','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101071404','兴城','葫芦岛','辽宁');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080101','呼和浩特','呼和浩特','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080102','土左旗','呼和浩特','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080103','托县','呼和浩特','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080104','和林','呼和浩特','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080105','清水河','呼和浩特','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080106','呼市郊区','呼和浩特','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080107','武川','呼和浩特','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080201','包头','包头','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080202','白云鄂博','包头','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080203','满都拉','包头','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080204','土右旗','包头','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080205','固阳','包头','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080206','达茂旗','包头','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080207','希拉穆仁','包头','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080301','乌海','乌海','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080401','集宁','乌兰察布','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080402','卓资','乌兰察布','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080403','化德','乌兰察布','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080404','商都','乌兰察布','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080406','兴和','乌兰察布','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080407','凉城','乌兰察布','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080408','察右前旗','乌兰察布','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080409','察右中旗','乌兰察布','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080410','察右后旗','乌兰察布','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080411','四子王旗','乌兰察布','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080412','丰镇','乌兰察布','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080501','通辽','通辽','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080502','舍伯吐','通辽','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080503','科左中旗','通辽','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080504','科左后旗','通辽','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080505','青龙山','通辽','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080506','开鲁','通辽','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080507','库伦','通辽','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080508','奈曼','通辽','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080509','扎鲁特','通辽','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080510','高力板','兴安盟','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080511','巴雅尔吐胡硕','通辽','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080601','赤峰','赤峰','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080603','阿鲁旗','赤峰','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080604','浩尔吐','赤峰','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080605','巴林左旗','赤峰','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080606','巴林右旗','赤峰','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080607','林西','赤峰','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080608','克什克腾','赤峰','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080609','翁牛特','赤峰','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080610','岗子','赤峰','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080611','喀喇沁','赤峰','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080612','八里罕','赤峰','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080613','宁城','赤峰','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080614','敖汉','赤峰','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080615','宝国吐','赤峰','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080701','鄂尔多斯','鄂尔多斯','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080703','达拉特','鄂尔多斯','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080704','准格尔','鄂尔多斯','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080705','鄂前旗','鄂尔多斯','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080706','河南','鄂尔多斯','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080707','伊克乌素','鄂尔多斯','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080708','鄂托克','鄂尔多斯','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080709','杭锦旗','鄂尔多斯','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080710','乌审旗','鄂尔多斯','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080711','伊金霍洛','鄂尔多斯','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080712','乌审召','鄂尔多斯','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080713','东胜','鄂尔多斯','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080801','临河','巴彦淖尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080802','五原','巴彦淖尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080803','磴口','巴彦淖尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080804','乌前旗','巴彦淖尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080805','大佘太','巴彦淖尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080806','乌中旗','巴彦淖尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080807','乌后旗','巴彦淖尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080808','海力素','巴彦淖尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080809','那仁宝力格','巴彦淖尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080810','杭锦后旗','巴彦淖尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080901','锡林浩特','锡林郭勒','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080903','二连浩特','锡林郭勒','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080904','阿巴嘎','锡林郭勒','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080906','苏左旗','锡林郭勒','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080907','苏右旗','锡林郭勒','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080908','朱日和','锡林郭勒','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080909','东乌旗','锡林郭勒','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080910','西乌旗','锡林郭勒','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080911','太仆寺','锡林郭勒','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080912','镶黄旗','锡林郭勒','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080913','正镶白旗','锡林郭勒','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080914','正蓝旗','锡林郭勒','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080915','多伦','锡林郭勒','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080916','博克图','锡林郭勒','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101080917','乌拉盖','锡林郭勒','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081001','海拉尔','呼伦贝尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081002','小二沟','呼伦贝尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081003','阿荣旗','呼伦贝尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081004','莫力达瓦','呼伦贝尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081005','鄂伦春旗','呼伦贝尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081006','鄂温克旗','呼伦贝尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081007','陈旗','呼伦贝尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081008','新左旗','呼伦贝尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081009','新右旗','呼伦贝尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081010','满洲里','呼伦贝尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081011','牙克石','呼伦贝尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081012','扎兰屯','呼伦贝尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081014','额尔古纳','呼伦贝尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081015','根河','呼伦贝尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081016','图里河','呼伦贝尔','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081101','乌兰浩特','兴安盟','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081102','阿尔山','兴安盟','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081103','科右中旗','兴安盟','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081104','胡尔勒','兴安盟','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081105','扎赉特','兴安盟','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081106','索伦','兴安盟','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081107','突泉','兴安盟','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081108','霍林郭勒','通辽','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081109','科右前旗','兴安盟','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081201','阿左旗','阿拉善盟','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081202','阿右旗','阿拉善盟','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081203','额济纳','阿拉善盟','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081204','拐子湖','阿拉善盟','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081205','吉兰太','阿拉善盟','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081206','锡林高勒','阿拉善盟','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081207','头道湖','阿拉善盟','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081208','中泉子','阿拉善盟','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081209','诺尔公','阿拉善盟','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081210','雅布赖','阿拉善盟','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081211','乌斯泰','阿拉善盟','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101081212','孪井滩','阿拉善盟','内蒙古');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090101','石家庄','石家庄','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090102','井陉','石家庄','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090103','正定','石家庄','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090104','栾城','石家庄','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090105','行唐','石家庄','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090106','灵寿','石家庄','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090107','高邑','石家庄','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090108','深泽','石家庄','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090109','赞皇','石家庄','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090110','无极','石家庄','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090111','平山','石家庄','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090112','元氏','石家庄','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090113','赵县','石家庄','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090114','辛集','石家庄','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090115','藁城','石家庄','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090116','晋州','石家庄','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090117','新乐','石家庄','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090118','鹿泉','石家庄','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090201','保定','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090202','满城','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090203','阜平','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090204','徐水','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090205','唐县','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090206','高阳','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090207','容城','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090209','涞源','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090210','望都','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090211','安新','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090212','易县','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090214','曲阳','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090215','蠡县','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090216','顺平','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090217','雄县','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090218','涿州','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090219','定州','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090220','安国','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090221','高碑店','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090222','涞水','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090223','定兴','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090224','清苑','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090225','博野','保定','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090301','张家口','张家口','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090302','宣化','张家口','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090303','张北','张家口','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090304','康保','张家口','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090305','沽源','张家口','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090306','尚义','张家口','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090307','蔚县','张家口','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090308','阳原','张家口','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090309','怀安','张家口','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090310','万全','张家口','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090311','怀来','张家口','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090312','涿鹿','张家口','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090313','赤城','张家口','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090314','崇礼','张家口','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090402','承德','承德','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090403','承德县','承德','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090404','兴隆','承德','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090405','平泉','承德','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090406','滦平','承德','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090407','隆化','承德','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090408','丰宁','承德','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090409','宽城','承德','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090410','围场','承德','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090501','唐山','唐山','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090502','丰南','唐山','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090503','丰润','唐山','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090504','滦县','唐山','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090505','滦南','唐山','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090506','乐亭','唐山','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090507','迁西','唐山','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090508','玉田','唐山','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090509','唐海','唐山','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090510','遵化','唐山','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090511','迁安','唐山','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090512','曹妃甸','唐山','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090601','廊坊','廊坊','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090602','固安','廊坊','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090603','永清','廊坊','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090604','香河','廊坊','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090605','大城','廊坊','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090606','文安','廊坊','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090607','大厂','廊坊','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090608','霸州','廊坊','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090609','三河','廊坊','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090701','沧州','沧州','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090702','青县','沧州','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090703','东光','沧州','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090704','海兴','沧州','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090705','盐山','沧州','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090706','肃宁','沧州','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090707','南皮','沧州','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090708','吴桥','沧州','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090709','献县','沧州','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090710','孟村','沧州','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090711','泊头','沧州','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090712','任丘','沧州','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090713','黄骅','沧州','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090714','河间','沧州','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090716','沧县','沧州','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090801','衡水','衡水','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090802','枣强','衡水','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090803','武邑','衡水','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090804','武强','衡水','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090805','饶阳','衡水','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090806','安平','衡水','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090807','故城','衡水','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090808','景县','衡水','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090809','阜城','衡水','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090810','冀州','衡水','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090811','深州','衡水','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090901','邢台','邢台','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090902','临城','邢台','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090904','内丘','邢台','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090905','柏乡','邢台','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090906','隆尧','邢台','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090907','南和','邢台','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090908','宁晋','邢台','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090909','巨鹿','邢台','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090910','新河','邢台','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090911','广宗','邢台','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090912','平乡','邢台','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090913','威县','邢台','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090914','清河','邢台','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090915','临西','邢台','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090916','南宫','邢台','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090917','沙河','邢台','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101090918','任县','邢台','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091001','邯郸','邯郸','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091002','峰峰','邯郸','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091003','临漳','邯郸','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091004','成安','邯郸','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091005','大名','邯郸','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091006','涉县','邯郸','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091007','磁县','邯郸','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091008','肥乡','邯郸','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091009','永年','邯郸','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091010','邱县','邯郸','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091011','鸡泽','邯郸','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091012','广平','邯郸','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091013','馆陶','邯郸','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091014','魏县','邯郸','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091015','曲周','邯郸','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091016','武安','邯郸','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091101','秦皇岛','秦皇岛','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091102','青龙','秦皇岛','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091103','昌黎','秦皇岛','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091104','抚宁','秦皇岛','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091105','卢龙','秦皇岛','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101091106','北戴河','秦皇岛','河北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100101','太原','太原','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100102','清徐','太原','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100103','阳曲','太原','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100104','娄烦','太原','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100105','古交','太原','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100106','尖草坪区','太原','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100107','小店区','太原','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100201','大同','大同','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100202','阳高','大同','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100203','大同县','大同','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100204','天镇','大同','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100205','广灵','大同','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100206','灵丘','大同','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100207','浑源','大同','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100208','左云','大同','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100301','阳泉','阳泉','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100302','盂县','阳泉','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100303','平定','阳泉','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100401','晋中','晋中','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100402','榆次','晋中','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100403','榆社','晋中','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100404','左权','晋中','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100405','和顺','晋中','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100406','昔阳','晋中','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100407','寿阳','晋中','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100408','太谷','晋中','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100409','祁县','晋中','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100410','平遥','晋中','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100411','灵石','晋中','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100412','介休','晋中','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100501','长治','长治','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100502','黎城','长治','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100503','屯留','长治','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100504','潞城','长治','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100505','襄垣','长治','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100506','平顺','长治','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100507','武乡','长治','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100508','沁县','长治','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100509','长子','长治','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100510','沁源','长治','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100511','壶关','长治','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100601','晋城','晋城','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100602','沁水','晋城','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100603','阳城','晋城','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100604','陵川','晋城','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100605','高平','晋城','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100606','泽州','晋城','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100701','临汾','临汾','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100702','曲沃','临汾','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100703','永和','临汾','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100704','隰县','临汾','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100705','大宁','临汾','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100706','吉县','临汾','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100707','襄汾','临汾','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100708','蒲县','临汾','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100709','汾西','临汾','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100710','洪洞','临汾','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100711','霍州','临汾','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100712','乡宁','临汾','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100713','翼城','临汾','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100714','侯马','临汾','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100715','浮山','临汾','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100716','安泽','临汾','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100717','古县','临汾','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100801','运城','运城','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100802','临猗','运城','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100803','稷山','运城','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100804','万荣','运城','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100805','河津','运城','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100806','新绛','运城','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100807','绛县','运城','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100808','闻喜','运城','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100809','垣曲','运城','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100810','永济','运城','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100811','芮城','运城','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100812','夏县','运城','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100813','平陆','运城','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100901','朔州','朔州','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100902','平鲁','朔州','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100903','山阴','朔州','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100904','右玉','朔州','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100905','应县','朔州','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101100906','怀仁','朔州','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101001','忻州','忻州','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101002','定襄','忻州','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101003','五台县','忻州','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101004','河曲','忻州','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101005','偏关','忻州','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101006','神池','忻州','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101007','宁武','忻州','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101008','代县','忻州','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101009','繁峙','忻州','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101010','五台山','忻州','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101011','保德','忻州','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101012','静乐','忻州','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101013','岢岚','忻州','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101014','五寨','忻州','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101015','原平','忻州','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101100','吕梁','吕梁','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101101','离石','吕梁','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101102','临县','吕梁','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101103','兴县','吕梁','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101104','岚县','吕梁','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101105','柳林','吕梁','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101106','石楼','吕梁','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101107','方山','吕梁','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101108','交口','吕梁','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101109','中阳','吕梁','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101110','孝义','吕梁','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101111','汾阳','吕梁','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101112','文水','吕梁','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101101113','交城','吕梁','山西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110101','西安','西安','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110102','长安','西安','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110103','临潼','西安','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110104','蓝田','西安','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110105','周至','西安','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110106','户县','西安','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110107','高陵','西安','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110200','咸阳','咸阳','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110201','三原','咸阳','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110202','礼泉','咸阳','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110203','永寿','咸阳','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110204','淳化','咸阳','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110205','泾阳','咸阳','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110206','武功','咸阳','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110207','乾县','咸阳','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110208','彬县','咸阳','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110209','长武','咸阳','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110210','旬邑','咸阳','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110211','兴平','咸阳','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110300','延安','延安','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110301','延长','延安','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110302','延川','延安','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110303','子长','延安','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110304','宜川','延安','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110305','富县','延安','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110306','志丹','延安','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110307','安塞','延安','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110308','甘泉','延安','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110309','洛川','延安','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110310','黄陵','延安','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110311','黄龙','延安','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110312','吴起','延安','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110401','榆林','榆林','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110402','府谷','榆林','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110403','神木','榆林','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110404','佳县','榆林','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110405','定边','榆林','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110406','靖边','榆林','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110407','横山','榆林','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110408','米脂','榆林','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110409','子洲','榆林','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110410','绥德','榆林','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110411','吴堡','榆林','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110412','清涧','榆林','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110413','榆阳','榆林','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110501','渭南','渭南','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110502','华县','渭南','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110503','潼关','渭南','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110504','大荔','渭南','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110505','白水','渭南','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110506','富平','渭南','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110507','蒲城','渭南','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110508','澄城','渭南','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110509','合阳','渭南','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110510','韩城','渭南','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110511','华阴','渭南','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110601','商洛','商洛','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110602','洛南','商洛','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110603','柞水','商洛','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110604','商州','商洛','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110605','镇安','商洛','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110606','丹凤','商洛','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110607','商南','商洛','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110608','山阳','商洛','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110701','安康','安康','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110702','紫阳','安康','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110703','石泉','安康','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110704','汉阴','安康','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110705','旬阳','安康','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110706','岚皋','安康','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110707','平利','安康','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110708','白河','安康','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110709','镇坪','安康','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110710','宁陕','安康','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110801','汉中','汉中','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110802','略阳','汉中','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110803','勉县','汉中','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110804','留坝','汉中','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110805','洋县','汉中','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110806','城固','汉中','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110807','西乡','汉中','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110808','佛坪','汉中','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110809','宁强','汉中','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110810','南郑','汉中','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110811','镇巴','汉中','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110901','宝鸡','宝鸡','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110903','千阳','宝鸡','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110904','麟游','宝鸡','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110905','岐山','宝鸡','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110906','凤翔','宝鸡','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110907','扶风','宝鸡','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110908','眉县','宝鸡','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110909','太白','宝鸡','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110910','凤县','宝鸡','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110911','陇县','宝鸡','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101110912','陈仓','宝鸡','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101111001','铜川','铜川','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101111002','耀县','铜川','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101111003','宜君','铜川','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101111004','耀州','铜川','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101111101','杨凌','杨凌','陕西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120101','济南','济南','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120102','长清','济南','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120103','商河','济南','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120104','章丘','济南','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120105','平阴','济南','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120106','济阳','济南','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120201','青岛','青岛','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120202','崂山','青岛','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120204','即墨','青岛','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120205','胶州','青岛','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120206','黄岛','青岛','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120207','莱西','青岛','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120208','平度','青岛','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120301','淄博','淄博','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120302','淄川','淄博','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120303','博山','淄博','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120304','高青','淄博','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120305','周村','淄博','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120306','沂源','淄博','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120307','桓台','淄博','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120308','临淄','淄博','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120401','德州','德州','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120402','武城','德州','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120403','临邑','德州','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120404','陵县','德州','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120405','齐河','德州','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120406','乐陵','德州','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120407','庆云','德州','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120408','平原','德州','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120409','宁津','德州','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120410','夏津','德州','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120411','禹城','德州','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120501','烟台','烟台','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120502','莱州','烟台','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120503','长岛','烟台','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120504','蓬莱','烟台','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120505','龙口','烟台','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120506','招远','烟台','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120507','栖霞','烟台','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120508','福山','烟台','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120509','牟平','烟台','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120510','莱阳','烟台','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120511','海阳','烟台','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120601','潍坊','潍坊','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120602','青州','潍坊','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120603','寿光','潍坊','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120604','临朐','潍坊','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120605','昌乐','潍坊','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120606','昌邑','潍坊','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120607','安丘','潍坊','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120608','高密','潍坊','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120609','诸城','潍坊','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120701','济宁','济宁','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120702','嘉祥','济宁','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120703','微山','济宁','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120704','鱼台','济宁','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120705','兖州','济宁','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120706','金乡','济宁','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120707','汶上','济宁','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120708','泗水','济宁','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120709','梁山','济宁','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120710','曲阜','济宁','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120711','邹城','济宁','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120801','泰安','泰安','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120802','新泰','泰安','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120804','肥城','泰安','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120805','东平','泰安','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120806','宁阳','泰安','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120901','临沂','临沂','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120902','莒南','临沂','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120903','沂南','临沂','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120904','兰陵','临沂','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120905','临沭','临沂','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120906','郯城','临沂','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120907','蒙阴','临沂','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120908','平邑','临沂','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120909','费县','临沂','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101120910','沂水','临沂','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121001','菏泽','菏泽','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121002','鄄城','菏泽','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121003','郓城','菏泽','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121004','东明','菏泽','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121005','定陶','菏泽','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121006','巨野','菏泽','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121007','曹县','菏泽','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121008','成武','菏泽','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121009','单县','菏泽','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121101','滨州','滨州','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121102','博兴','滨州','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121103','无棣','滨州','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121104','阳信','滨州','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121105','惠民','滨州','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121106','沾化','滨州','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121107','邹平','滨州','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121201','东营','东营','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121202','河口','东营','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121203','垦利','东营','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121204','利津','东营','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121205','广饶','东营','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121301','威海','威海','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121302','文登','威海','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121303','荣成','威海','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121304','乳山','威海','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121305','成山头','威海','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121306','石岛','威海','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121401','枣庄','枣庄','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121402','薛城','枣庄','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121403','峄城','枣庄','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121404','台儿庄','枣庄','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121405','滕州','枣庄','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121501','日照','日照','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121502','五莲','日照','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121503','莒县','日照','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121601','莱芜','莱芜','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121701','聊城','聊城','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121702','冠县','聊城','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121703','阳谷','聊城','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121704','高唐','聊城','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121705','茌平','聊城','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121706','东阿','聊城','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121707','临清','聊城','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101121709','莘县','聊城','山东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130101','乌鲁木齐','乌鲁木齐','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130103','小渠子','乌鲁木齐','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130105','达坂城','乌鲁木齐','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130108','乌鲁木齐牧试站','乌鲁木齐','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130109','天池','乌鲁木齐','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130110','白杨沟','乌鲁木齐','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130201','克拉玛依','克拉玛依','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130202','乌尔禾','克拉玛依','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130203','白碱滩','克拉玛依','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130301','石河子','石河子','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130302','炮台','石河子','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130303','莫索湾','石河子','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130401','昌吉','昌吉','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130402','呼图壁','昌吉','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130403','米泉','昌吉','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130404','阜康','昌吉','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130405','吉木萨尔','昌吉','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130406','奇台','昌吉','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130407','玛纳斯','昌吉','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130408','木垒','昌吉','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130409','蔡家湖','昌吉','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130501','吐鲁番','吐鲁番','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130502','托克逊','吐鲁番','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130504','鄯善','吐鲁番','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130601','库尔勒','巴音郭楞','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130602','轮台','巴音郭楞','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130603','尉犁','巴音郭楞','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130604','若羌','巴音郭楞','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130605','且末','巴音郭楞','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130606','和静','巴音郭楞','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130607','焉耆','巴音郭楞','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130608','和硕','巴音郭楞','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130610','巴音布鲁克','巴音郭楞','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130611','铁干里克','巴音郭楞','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130612','博湖','巴音郭楞','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130613','塔中','巴音郭楞','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130614','巴仑台','巴音郭楞','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130701','阿拉尔','阿拉尔','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130801','阿克苏','阿克苏','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130802','乌什','阿克苏','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130803','温宿','阿克苏','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130804','拜城','阿克苏','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130805','新和','阿克苏','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130806','沙雅','阿克苏','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130807','库车','阿克苏','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130808','柯坪','阿克苏','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130809','阿瓦提','阿克苏','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130901','喀什','喀什','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130902','英吉沙','喀什','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130903','塔什库尔干','喀什','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130904','麦盖提','喀什','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130905','莎车','喀什','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130906','叶城','喀什','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130907','泽普','喀什','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130908','巴楚','喀什','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130909','岳普湖','喀什','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130910','伽师','喀什','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130911','疏附','喀什','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101130912','疏勒','喀什','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131001','伊宁','伊犁','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131002','察布查尔','伊犁','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131003','尼勒克','伊犁','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131004','伊宁县','伊犁','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131005','巩留','伊犁','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131006','新源','伊犁','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131007','昭苏','伊犁','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131008','特克斯','伊犁','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131009','霍城','伊犁','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131010','霍尔果斯','伊犁','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131011','奎屯','伊犁','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131101','塔城','塔城','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131102','裕民','塔城','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131103','额敏','塔城','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131104','和布克赛尔','塔城','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131105','托里','塔城','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131106','乌苏','塔城','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131107','沙湾','塔城','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131201','哈密','哈密','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131203','巴里坤','哈密','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131204','伊吾','哈密','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131301','和田','和田','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131302','皮山','和田','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131303','策勒','和田','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131304','墨玉','和田','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131305','洛浦','和田','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131306','民丰','和田','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131307','于田','和田','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131401','阿勒泰','阿勒泰','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131402','哈巴河','阿勒泰','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131405','吉木乃','阿勒泰','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131406','布尔津','阿勒泰','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131407','福海','阿勒泰','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131408','富蕴','阿勒泰','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131409','青河','阿勒泰','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131501','阿图什','克州','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131502','乌恰','克州','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131503','阿克陶','克州','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131504','阿合奇','克州','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131601','博乐','博尔塔拉','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131602','温泉','博尔塔拉','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131603','精河','博尔塔拉','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101131606','阿拉山口','博尔塔拉','新疆');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140101','拉萨','拉萨','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140102','当雄','拉萨','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140103','尼木','拉萨','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140104','林周','拉萨','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140105','堆龙德庆','拉萨','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140106','曲水','拉萨','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140107','达孜','拉萨','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140108','墨竹工卡','拉萨','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140201','日喀则','日喀则','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140202','拉孜','日喀则','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140203','南木林','日喀则','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140204','聂拉木','日喀则','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140205','定日','日喀则','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140206','江孜','日喀则','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140207','帕里','日喀则','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140208','仲巴','日喀则','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140209','萨嘎','日喀则','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140210','吉隆','日喀则','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140211','昂仁','日喀则','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140212','定结','日喀则','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140213','萨迦','日喀则','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140214','谢通门','日喀则','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140216','岗巴','日喀则','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140217','白朗','日喀则','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140218','亚东','日喀则','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140219','康马','日喀则','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140220','仁布','日喀则','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140301','山南','山南','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140302','贡嘎','山南','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140303','札囊','山南','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140304','加查','山南','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140305','浪卡子','山南','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140306','错那','山南','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140307','隆子','山南','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140308','泽当','山南','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140309','乃东','山南','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140310','桑日','山南','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140311','洛扎','山南','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140312','措美','山南','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140313','琼结','山南','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140314','曲松','山南','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140401','林芝','林芝','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140402','波密','林芝','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140403','米林','林芝','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140404','察隅','林芝','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140405','工布江达','林芝','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140406','朗县','林芝','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140407','墨脱','林芝','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140501','昌都','昌都','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140502','丁青','昌都','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140503','边坝','昌都','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140504','洛隆','昌都','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140505','左贡','昌都','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140506','芒康','昌都','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140507','类乌齐','昌都','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140508','八宿','昌都','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140509','江达','昌都','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140510','察雅','昌都','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140511','贡觉','昌都','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140601','那曲','那曲','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140602','尼玛','那曲','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140603','嘉黎','那曲','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140604','班戈','那曲','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140605','安多','那曲','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140606','索县','那曲','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140607','聂荣','那曲','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140608','巴青','那曲','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140609','比如','那曲','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140610','双湖','那曲','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140701','阿里','阿里','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140702','改则','阿里','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140703','申扎','阿里','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140704','狮泉河','阿里','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140705','普兰','阿里','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140706','札达','阿里','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140707','噶尔','阿里','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140708','日土','阿里','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140709','革吉','阿里','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101140710','措勤','阿里','西藏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150101','西宁','西宁','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150102','大通','西宁','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150103','湟源','西宁','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150104','湟中','西宁','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150201','海东','海东','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150202','乐都','海东','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150203','民和','海东','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150204','互助','海东','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150205','化隆','海东','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150206','循化','海东','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150207','冷湖','海东','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150208','平安','海东','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150301','黄南','黄南','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150302','尖扎','黄南','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150303','泽库','黄南','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150304','河南','黄南','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150305','同仁','黄南','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150401','海南','海南','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150404','贵德','海南','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150406','兴海','海南','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150407','贵南','海南','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150408','同德','海南','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150409','共和','海南','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150501','果洛','果洛','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150502','班玛','果洛','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150503','甘德','果洛','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150504','达日','果洛','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150505','久治','果洛','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150506','玛多','果洛','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150508','玛沁','果洛','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150601','玉树','玉树','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150602','称多','玉树','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150603','治多','玉树','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150604','杂多','玉树','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150605','囊谦','玉树','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150606','曲麻莱','玉树','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150701','海西','海西','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150708','天峻','海西','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150709','乌兰','海西','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150712','茫崖','海西','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150713','大柴旦','海西','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150716','德令哈','海西','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150801','海北','海北','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150802','门源','海北','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150803','祁连','海北','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150804','海晏','海北','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150806','刚察','海北','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150901','格尔木','格尔木','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101150902','都兰','格尔木','青海');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160101','兰州','兰州','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160102','皋兰','兰州','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160103','永登','兰州','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160104','榆中','兰州','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160201','定西','定西','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160202','通渭','定西','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160203','陇西','定西','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160204','渭源','定西','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160205','临洮','定西','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160206','漳县','定西','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160207','岷县','定西','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160208','安定','定西','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160301','平凉','平凉','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160302','泾川','平凉','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160303','灵台','平凉','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160304','崇信','平凉','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160305','华亭','平凉','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160306','庄浪','平凉','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160307','静宁','平凉','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160308','崆峒','平凉','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160401','庆阳','庆阳','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160403','环县','庆阳','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160404','华池','庆阳','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160405','合水','庆阳','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160406','正宁','庆阳','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160407','宁县','庆阳','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160408','镇原','庆阳','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160409','庆城','庆阳','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160501','武威','武威','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160502','民勤','武威','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160503','古浪','武威','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160505','天祝','武威','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160601','金昌','金昌','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160602','永昌','金昌','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160701','张掖','张掖','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160702','肃南','张掖','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160703','民乐','张掖','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160704','临泽','张掖','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160705','高台','张掖','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160706','山丹','张掖','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160801','酒泉','酒泉','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160803','金塔','酒泉','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160804','阿克塞','酒泉','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160805','瓜州','酒泉','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160806','肃北','酒泉','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160807','玉门','酒泉','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160808','敦煌','酒泉','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160901','天水','天水','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160903','清水','天水','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160904','秦安','天水','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160905','甘谷','天水','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160906','武山','天水','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160907','张家川','天水','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101160908','麦积','天水','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161001','武都','陇南','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161002','成县','陇南','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161003','文县','陇南','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161004','宕昌','陇南','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161005','康县','陇南','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161006','西和','陇南','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161007','礼县','陇南','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161008','徽县','陇南','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161009','两当','陇南','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161101','临夏','临夏','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161102','康乐','临夏','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161103','永靖','临夏','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161104','广河','临夏','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161105','和政','临夏','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161106','东乡','临夏','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161107','积石山','临夏','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161201','合作','甘南','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161202','临潭','甘南','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161203','卓尼','甘南','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161204','舟曲','甘南','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161205','迭部','甘南','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161206','玛曲','甘南','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161207','碌曲','甘南','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161208','夏河','甘南','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161301','白银','白银','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161302','靖远','白银','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161303','会宁','白银','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161304','平川','白银','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161305','景泰','白银','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101161401','嘉峪关','嘉峪关','甘肃');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101170101','银川','银川','宁夏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101170102','永宁','银川','宁夏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101170103','灵武','银川','宁夏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101170104','贺兰','银川','宁夏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101170201','石嘴山','石嘴山','宁夏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101170202','惠农','石嘴山','宁夏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101170203','平罗','石嘴山','宁夏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101170204','陶乐','石嘴山','宁夏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101170301','吴忠','吴忠','宁夏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101170302','同心','吴忠','宁夏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101170303','盐池','吴忠','宁夏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101170306','青铜峡','吴忠','宁夏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101170401','固原','固原','宁夏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101170402','西吉','固原','宁夏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101170403','隆德','固原','宁夏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101170404','泾源','固原','宁夏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101170406','彭阳','固原','宁夏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101170501','中卫','中卫','宁夏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101170502','中宁','中卫','宁夏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101170504','海原','中卫','宁夏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180101','郑州','郑州','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180102','巩义','郑州','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180103','荥阳','郑州','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180104','登封','郑州','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180105','新密','郑州','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180106','新郑','郑州','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180107','中牟','郑州','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180108','上街','郑州','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180201','安阳','安阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180202','汤阴','安阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180203','滑县','安阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180204','内黄','安阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180205','林州','安阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180301','新乡','新乡','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180302','获嘉','新乡','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180303','原阳','新乡','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180304','辉县','新乡','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180305','卫辉','新乡','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180306','延津','新乡','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180307','封丘','新乡','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180308','长垣','新乡','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180401','许昌','许昌','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180402','鄢陵','许昌','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180403','襄城','许昌','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180404','长葛','许昌','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180405','禹州','许昌','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180501','平顶山','平顶山','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180502','郏县','平顶山','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180503','宝丰','平顶山','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180504','汝州','平顶山','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180505','叶县','平顶山','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180506','舞钢','平顶山','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180507','鲁山','平顶山','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180508','石龙','平顶山','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180601','信阳','信阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180602','息县','信阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180603','罗山','信阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180604','光山','信阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180605','新县','信阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180606','淮滨','信阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180607','潢川','信阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180608','固始','信阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180609','商城','信阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180701','南阳','南阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180702','南召','南阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180703','方城','南阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180704','社旗','南阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180705','西峡','南阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180706','内乡','南阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180707','镇平','南阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180708','淅川','南阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180709','新野','南阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180710','唐河','南阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180711','邓州','南阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180712','桐柏','南阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180801','开封','开封','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180802','杞县','开封','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180803','尉氏','开封','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180804','通许','开封','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180805','兰考','开封','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180901','洛阳','洛阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180902','新安','洛阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180903','孟津','洛阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180904','宜阳','洛阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180905','洛宁','洛阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180906','伊川','洛阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180907','嵩县','洛阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180908','偃师','洛阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180909','栾川','洛阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180910','汝阳','洛阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101180911','吉利','洛阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181001','商丘','商丘','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181003','睢县','商丘','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181004','民权','商丘','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181005','虞城','商丘','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181006','柘城','商丘','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181007','宁陵','商丘','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181008','夏邑','商丘','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181009','永城','商丘','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181101','焦作','焦作','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181102','修武','焦作','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181103','武陟','焦作','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181104','沁阳','焦作','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181106','博爱','焦作','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181107','温县','焦作','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181108','孟州','焦作','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181201','鹤壁','鹤壁','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181202','浚县','鹤壁','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181203','淇县','鹤壁','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181301','濮阳','濮阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181302','台前','濮阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181303','南乐','濮阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181304','清丰','濮阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181305','范县','濮阳','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181401','周口','周口','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181402','扶沟','周口','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181403','太康','周口','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181404','淮阳','周口','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181405','西华','周口','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181406','商水','周口','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181407','项城','周口','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181408','郸城','周口','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181409','鹿邑','周口','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181410','沈丘','周口','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181501','漯河','漯河','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181502','临颍','漯河','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181503','舞阳','漯河','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181601','驻马店','驻马店','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181602','西平','驻马店','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181603','遂平','驻马店','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181604','上蔡','驻马店','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181605','汝南','驻马店','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181606','泌阳','驻马店','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181607','平舆','驻马店','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181608','新蔡','驻马店','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181609','确山','驻马店','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181610','正阳','驻马店','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181701','三门峡','三门峡','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181702','灵宝','三门峡','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181703','渑池','三门峡','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181704','卢氏','三门峡','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181705','义马','三门峡','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181706','陕县','三门峡','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101181801','济源','济源','河南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190101','南京','南京','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190102','溧水','南京','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190103','高淳','南京','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190104','江宁','南京','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190105','六合','南京','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190106','江浦','南京','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190107','浦口','南京','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190201','无锡','无锡','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190202','江阴','无锡','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190203','宜兴','无锡','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190204','锡山','无锡','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190301','镇江','镇江','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190302','丹阳','镇江','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190303','扬中','镇江','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190304','句容','镇江','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190305','丹徒','镇江','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190401','苏州','苏州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190402','常熟','苏州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190403','张家港','苏州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190404','昆山','苏州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190405','吴中','苏州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190407','吴江','苏州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190408','太仓','苏州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190501','南通','南通','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190502','海安','南通','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190503','如皋','南通','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190504','如东','南通','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190507','启东','南通','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190508','海门','南通','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190509','通州','南通','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190601','扬州','扬州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190602','宝应','扬州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190603','仪征','扬州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190604','高邮','扬州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190605','江都','扬州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190606','邗江','扬州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190701','盐城','盐城','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190702','响水','盐城','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190703','滨海','盐城','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190704','阜宁','盐城','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190705','射阳','盐城','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190706','建湖','盐城','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190707','东台','盐城','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190708','大丰','盐城','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190709','盐都','盐城','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190801','徐州','徐州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190802','铜山','徐州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190803','丰县','徐州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190804','沛县','徐州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190805','邳州','徐州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190806','睢宁','徐州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190807','新沂','徐州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190901','淮安','淮安','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190902','金湖','淮安','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190903','盱眙','淮安','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190904','洪泽','淮安','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190905','涟水','淮安','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190906','淮阴区','淮安','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101190908','淮安区','淮安','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101191001','连云港','连云港','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101191002','东海','连云港','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101191003','赣榆','连云港','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101191004','灌云','连云港','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101191005','灌南','连云港','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101191101','常州','常州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101191102','溧阳','常州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101191103','金坛','常州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101191104','武进','常州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101191201','泰州','泰州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101191202','兴化','泰州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101191203','泰兴','泰州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101191204','姜堰','泰州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101191205','靖江','泰州','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101191301','宿迁','宿迁','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101191302','沭阳','宿迁','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101191303','泗阳','宿迁','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101191304','泗洪','宿迁','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101191305','宿豫','宿迁','江苏');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200101','武汉','武汉','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200102','蔡甸','武汉','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200103','黄陂','武汉','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200104','新洲','武汉','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200105','江夏','武汉','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200106','东西湖','武汉','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200201','襄阳','襄阳','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200202','襄州','襄阳','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200203','保康','襄阳','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200204','南漳','襄阳','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200205','宜城','襄阳','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200206','老河口','襄阳','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200207','谷城','襄阳','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200208','枣阳','襄阳','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200301','鄂州','鄂州','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200302','梁子湖','鄂州','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200401','孝感','孝感','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200402','安陆','孝感','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200403','云梦','孝感','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200404','大悟','孝感','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200405','应城','孝感','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200406','汉川','孝感','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200407','孝昌','孝感','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200501','黄冈','黄冈','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200502','红安','黄冈','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200503','麻城','黄冈','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200504','罗田','黄冈','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200505','英山','黄冈','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200506','浠水','黄冈','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200507','蕲春','黄冈','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200508','黄梅','黄冈','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200509','武穴','黄冈','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200510','团风','黄冈','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200601','黄石','黄石','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200602','大冶','黄石','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200603','阳新','黄石','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200604','铁山','黄石','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200605','下陆','黄石','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200606','西塞山','黄石','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200701','咸宁','咸宁','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200702','赤壁','咸宁','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200703','嘉鱼','咸宁','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200704','崇阳','咸宁','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200705','通城','咸宁','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200706','通山','咸宁','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200801','荆州','荆州','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200802','江陵','荆州','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200803','公安','荆州','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200804','石首','荆州','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200805','监利','荆州','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200806','洪湖','荆州','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200807','松滋','荆州','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200901','宜昌','宜昌','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200902','远安','宜昌','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200903','秭归','宜昌','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200904','兴山','宜昌','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200906','五峰','宜昌','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200907','当阳','宜昌','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200908','长阳','宜昌','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200909','宜都','宜昌','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200910','枝江','宜昌','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200911','三峡','宜昌','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101200912','夷陵','宜昌','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201001','恩施','恩施','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201002','利川','恩施','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201003','建始','恩施','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201004','咸丰','恩施','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201005','宣恩','恩施','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201006','鹤峰','恩施','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201007','来凤','恩施','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201008','巴东','恩施','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201101','十堰','十堰','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201102','竹溪','十堰','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201103','郧西','十堰','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201104','郧县','十堰','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201105','竹山','十堰','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201106','房县','十堰','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201107','丹江口','十堰','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201108','茅箭','十堰','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201109','张湾','十堰','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201201','神农架','神农架','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201301','随州','随州','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201302','广水','随州','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201401','荆门','荆门','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201402','钟祥','荆门','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201403','京山','荆门','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201404','掇刀','荆门','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201405','沙洋','荆门','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201406','沙市','荆州','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201501','天门','天门','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201601','仙桃','仙桃','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101201701','潜江','潜江','湖北');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210101','杭州','杭州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210102','萧山','杭州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210103','桐庐','杭州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210104','淳安','杭州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210105','建德','杭州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210106','余杭','杭州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210107','临安','杭州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210108','富阳','杭州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210201','湖州','湖州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210202','长兴','湖州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210203','安吉','湖州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210204','德清','湖州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210301','嘉兴','嘉兴','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210302','嘉善','嘉兴','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210303','海宁','嘉兴','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210304','桐乡','嘉兴','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210305','平湖','嘉兴','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210306','海盐','嘉兴','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210401','宁波','宁波','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210403','慈溪','宁波','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210404','余姚','宁波','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210405','奉化','宁波','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210406','象山','宁波','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210408','宁海','宁波','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210410','北仑','宁波','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210411','鄞州','宁波','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210412','镇海','宁波','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210501','绍兴','绍兴','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210502','诸暨','绍兴','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210503','上虞','绍兴','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210504','新昌','绍兴','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210505','嵊州','绍兴','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210601','台州','台州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210603','玉环','台州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210604','三门','台州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210605','天台','台州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210606','仙居','台州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210607','温岭','台州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210609','洪家','台州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210610','临海','台州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210611','椒江','台州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210612','黄岩','台州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210613','路桥','台州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210701','温州','温州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210702','泰顺','温州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210703','文成','温州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210704','平阳','温州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210705','瑞安','温州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210706','洞头','温州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210707','乐清','温州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210708','永嘉','温州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210709','苍南','温州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210801','丽水','丽水','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210802','遂昌','丽水','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210803','龙泉','丽水','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210804','缙云','丽水','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210805','青田','丽水','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210806','云和','丽水','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210807','庆元','丽水','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210808','松阳','丽水','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210809','景宁','丽水','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210901','金华','金华','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210902','浦江','金华','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210903','兰溪','金华','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210904','义乌','金华','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210905','东阳','金华','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210906','武义','金华','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210907','永康','金华','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101210908','磐安','金华','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101211001','衢州','衢州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101211002','常山','衢州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101211003','开化','衢州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101211004','龙游','衢州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101211005','江山','衢州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101211006','衢江','衢州','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101211101','舟山','舟山','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101211102','嵊泗','舟山','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101211104','岱山','舟山','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101211105','普陀','舟山','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101211106','定海','舟山','浙江');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220101','合肥','合肥','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220102','长丰','合肥','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220103','肥东','合肥','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220104','肥西','合肥','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220105','巢湖','合肥','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220106','庐江','合肥','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220201','蚌埠','蚌埠','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220202','怀远','蚌埠','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220203','固镇','蚌埠','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220204','五河','蚌埠','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220301','芜湖','芜湖','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220302','繁昌','芜湖','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220303','芜湖县','芜湖','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220304','南陵','芜湖','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220305','无为','芜湖','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220401','淮南','淮南','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220402','凤台','淮南','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220403','潘集','淮南','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220501','马鞍山','马鞍山','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220502','当涂','马鞍山','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220503','含山','马鞍山','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220504','和县','马鞍山','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220601','安庆','安庆','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220602','枞阳','安庆','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220603','太湖','安庆','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220604','潜山','安庆','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220605','怀宁','安庆','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220606','宿松','安庆','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220607','望江','安庆','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220608','岳西','安庆','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220609','桐城','安庆','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220701','宿州','宿州','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220702','砀山','宿州','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220703','灵璧','宿州','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220704','泗县','宿州','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220705','萧县','宿州','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220801','阜阳','阜阳','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220802','阜南','阜阳','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220803','颍上','阜阳','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220804','临泉','阜阳','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220805','界首','阜阳','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220806','太和','阜阳','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220901','亳州','亳州','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220902','涡阳','亳州','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220903','利辛','亳州','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101220904','蒙城','亳州','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221001','黄山','黄山','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221002','黄山区','黄山','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221003','屯溪','黄山','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221004','祁门','黄山','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221005','黟县','黄山','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221006','歙县','黄山','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221007','休宁','黄山','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221008','黄山风景区','黄山','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221101','滁州','滁州','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221102','凤阳','滁州','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221103','明光','滁州','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221104','定远','滁州','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221105','全椒','滁州','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221106','来安','滁州','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221107','天长','滁州','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221201','淮北','淮北','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221202','濉溪','淮北','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221301','铜陵','铜陵','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221401','宣城','宣城','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221402','泾县','宣城','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221403','旌德','宣城','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221404','宁国','宣城','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221405','绩溪','宣城','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221406','广德','宣城','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221407','郎溪','宣城','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221501','六安','六安','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221502','霍邱','六安','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221503','寿县','六安','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221505','金寨','六安','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221506','霍山','六安','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221507','舒城','六安','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221701','池州','池州','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221702','东至','池州','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221703','青阳','池州','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221704','九华山','池州','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101221705','石台','池州','安徽');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230101','福州','福州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230102','闽清','福州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230103','闽侯','福州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230104','罗源','福州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230105','连江','福州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230107','永泰','福州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230108','平潭','福州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230110','长乐','福州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230111','福清','福州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230201','厦门','厦门','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230202','同安','厦门','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230301','宁德','宁德','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230302','古田','宁德','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230303','霞浦','宁德','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230304','寿宁','宁德','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230305','周宁','宁德','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230306','福安','宁德','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230307','柘荣','宁德','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230308','福鼎','宁德','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230309','屏南','宁德','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230401','莆田','莆田','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230402','仙游','莆田','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230403','秀屿港','莆田','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230404','涵江','莆田','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230405','秀屿','莆田','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230406','荔城','莆田','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230407','城厢','莆田','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230501','泉州','泉州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230502','安溪','泉州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230504','永春','泉州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230505','德化','泉州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230506','南安','泉州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230507','崇武','泉州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230508','惠安','泉州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230509','晋江','泉州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230510','石狮','泉州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230601','漳州','漳州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230602','长泰','漳州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230603','南靖','漳州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230604','平和','漳州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230605','龙海','漳州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230606','漳浦','漳州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230607','诏安','漳州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230608','东山','漳州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230609','云霄','漳州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230610','华安','漳州','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230701','龙岩','龙岩','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230702','长汀','龙岩','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230703','连城','龙岩','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230704','武平','龙岩','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230705','上杭','龙岩','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230706','永定','龙岩','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230707','漳平','龙岩','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230801','三明','三明','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230802','宁化','三明','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230803','清流','三明','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230804','泰宁','三明','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230805','将乐','三明','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230806','建宁','三明','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230807','明溪','三明','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230808','沙县','三明','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230809','尤溪','三明','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230810','永安','三明','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230811','大田','三明','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230901','南平','南平','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230902','顺昌','南平','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230903','光泽','南平','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230904','邵武','南平','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230905','武夷山','南平','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230906','浦城','南平','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230907','建阳','南平','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230908','松溪','南平','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230909','政和','南平','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101230910','建瓯','南平','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101231001','钓鱼岛','钓鱼岛','福建');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240101','南昌','南昌','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240102','新建','南昌','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240103','南昌县','南昌','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240104','安义','南昌','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240105','进贤','南昌','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240201','九江','九江','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240202','瑞昌','九江','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240203','庐山','九江','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240204','武宁','九江','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240205','德安','九江','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240206','永修','九江','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240207','湖口','九江','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240208','彭泽','九江','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240209','星子','九江','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240210','都昌','九江','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240212','修水','九江','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240301','上饶','上饶','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240302','鄱阳','上饶','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240303','婺源','上饶','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240305','余干','上饶','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240306','万年','上饶','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240307','德兴','上饶','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240308','上饶县','上饶','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240309','弋阳','上饶','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240310','横峰','上饶','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240311','铅山','上饶','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240312','玉山','上饶','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240313','广丰','上饶','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240401','抚州','抚州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240402','广昌','抚州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240403','乐安','抚州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240404','崇仁','抚州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240405','金溪','抚州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240406','资溪','抚州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240407','宜黄','抚州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240408','南城','抚州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240409','南丰','抚州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240410','黎川','抚州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240411','东乡','抚州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240501','宜春','宜春','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240502','铜鼓','宜春','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240503','宜丰','宜春','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240504','万载','宜春','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240505','上高','宜春','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240506','靖安','宜春','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240507','奉新','宜春','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240508','高安','宜春','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240509','樟树','宜春','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240510','丰城','宜春','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240601','吉安','吉安','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240602','吉安县','吉安','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240603','吉水','吉安','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240604','新干','吉安','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240605','峡江','吉安','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240606','永丰','吉安','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240607','永新','吉安','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240608','井冈山','吉安','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240609','万安','吉安','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240610','遂川','吉安','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240611','泰和','吉安','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240612','安福','吉安','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240613','宁冈','吉安','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240701','赣州','赣州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240702','崇义','赣州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240703','上犹','赣州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240704','南康','赣州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240705','大余','赣州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240706','信丰','赣州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240707','宁都','赣州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240708','石城','赣州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240709','瑞金','赣州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240710','于都','赣州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240711','会昌','赣州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240712','安远','赣州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240713','全南','赣州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240714','龙南','赣州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240715','定南','赣州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240716','寻乌','赣州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240717','兴国','赣州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240718','赣县','赣州','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240801','景德镇','景德镇','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240802','乐平','景德镇','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240803','浮梁','景德镇','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240901','萍乡','萍乡','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240902','莲花','萍乡','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240903','上栗','萍乡','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240904','安源','萍乡','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240905','芦溪','萍乡','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101240906','湘东','萍乡','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101241001','新余','新余','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101241002','分宜','新余','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101241101','鹰潭','鹰潭','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101241102','余江','鹰潭','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101241103','贵溪','鹰潭','江西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250101','长沙','长沙','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250102','宁乡','长沙','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250103','浏阳','长沙','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250104','马坡岭','长沙','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250105','望城','长沙','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250201','湘潭','湘潭','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250202','韶山','湘潭','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250203','湘乡','湘潭','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250301','株洲','株洲','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250302','攸县','株洲','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250303','醴陵','株洲','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250305','茶陵','株洲','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250306','炎陵','株洲','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250401','衡阳','衡阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250402','衡山','衡阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250403','衡东','衡阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250404','祁东','衡阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250405','衡阳县','衡阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250406','常宁','衡阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250407','衡南','衡阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250408','耒阳','衡阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250409','南岳','衡阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250501','郴州','郴州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250502','桂阳','郴州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250503','嘉禾','郴州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250504','宜章','郴州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250505','临武','郴州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250507','资兴','郴州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250508','汝城','郴州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250509','安仁','郴州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250510','永兴','郴州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250511','桂东','郴州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250512','苏仙','郴州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250601','常德','常德','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250602','安乡','常德','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250603','桃源','常德','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250604','汉寿','常德','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250605','澧县','常德','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250606','临澧','常德','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250607','石门','常德','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250608','津市','常德','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250700','益阳','益阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250701','赫山区','益阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250702','南县','益阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250703','桃江','益阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250704','安化','益阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250705','沅江','益阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250801','娄底','娄底','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250802','双峰','娄底','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250803','冷水江','娄底','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250805','新化','娄底','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250806','涟源','娄底','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250901','邵阳','邵阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250902','隆回','邵阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250903','洞口','邵阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250904','新邵','邵阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250905','邵东','邵阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250906','绥宁','邵阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250907','新宁','邵阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250908','武冈','邵阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250909','城步','邵阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101250910','邵阳县','邵阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251001','岳阳','岳阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251002','华容','岳阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251003','湘阴','岳阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251004','汨罗','岳阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251005','平江','岳阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251006','临湘','岳阳','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251101','张家界','张家界','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251102','桑植','张家界','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251103','慈利','张家界','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251104','武陵源','张家界','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251201','怀化','怀化','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251203','沅陵','怀化','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251204','辰溪','怀化','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251205','靖州','怀化','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251206','会同','怀化','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251207','通道','怀化','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251208','麻阳','怀化','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251209','新晃','怀化','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251210','芷江','怀化','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251211','溆浦','怀化','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251212','中方','怀化','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251213','洪江','怀化','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251401','永州','永州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251402','祁阳','永州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251403','东安','永州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251404','双牌','永州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251405','道县','永州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251406','宁远','永州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251407','江永','永州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251408','蓝山','永州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251409','新田','永州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251410','江华','永州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251411','冷水滩','永州','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251501','吉首','湘西','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251502','保靖','湘西','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251503','永顺','湘西','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251504','古丈','湘西','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251505','凤凰','湘西','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251506','泸溪','湘西','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251507','龙山','湘西','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101251508','花垣','湘西','湖南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260101','贵阳','贵阳','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260102','白云','贵阳','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260103','花溪','贵阳','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260104','乌当','贵阳','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260105','息烽','贵阳','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260106','开阳','贵阳','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260107','修文','贵阳','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260108','清镇','贵阳','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260109','小河','贵阳','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260110','云岩','贵阳','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260111','南明','贵阳','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260201','遵义','遵义','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260202','遵义县','遵义','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260203','仁怀','遵义','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260204','绥阳','遵义','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260205','湄潭','遵义','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260206','凤冈','遵义','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260207','桐梓','遵义','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260208','赤水','遵义','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260209','习水','遵义','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260210','道真','遵义','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260211','正安','遵义','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260212','务川','遵义','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260213','余庆','遵义','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260214','汇川','遵义','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260215','红花岗','遵义','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260301','安顺','安顺','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260302','普定','安顺','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260303','镇宁','安顺','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260304','平坝','安顺','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260305','紫云','安顺','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260306','关岭','安顺','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260401','都匀','黔南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260402','贵定','黔南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260403','瓮安','黔南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260404','长顺','黔南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260405','福泉','黔南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260406','惠水','黔南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260407','龙里','黔南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260408','罗甸','黔南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260409','平塘','黔南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260410','独山','黔南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260411','三都','黔南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260412','荔波','黔南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260501','凯里','黔东南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260502','岑巩','黔东南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260503','施秉','黔东南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260504','镇远','黔东南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260505','黄平','黔东南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260507','麻江','黔东南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260508','丹寨','黔东南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260509','三穗','黔东南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260510','台江','黔东南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260511','剑河','黔东南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260512','雷山','黔东南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260513','黎平','黔东南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260514','天柱','黔东南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260515','锦屏','黔东南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260516','榕江','黔东南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260517','从江','黔东南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260601','铜仁','铜仁','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260602','江口','铜仁','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260603','玉屏','铜仁','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260604','万山','铜仁','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260605','思南','铜仁','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260607','印江','铜仁','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260608','石阡','铜仁','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260609','沿河','铜仁','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260610','德江','铜仁','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260611','松桃','铜仁','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260701','毕节','毕节','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260702','赫章','毕节','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260703','金沙','毕节','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260704','威宁','毕节','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260705','大方','毕节','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260706','纳雍','毕节','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260707','织金','毕节','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260708','黔西','毕节','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260801','水城','六盘水','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260802','六枝','六盘水','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260804','盘县','六盘水','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260901','兴义','黔西南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260902','晴隆','黔西南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260903','兴仁','黔西南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260904','贞丰','黔西南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260905','望谟','黔西南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260907','安龙','黔西南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260908','册亨','黔西南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101260909','普安','黔西南','贵州');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270101','成都','成都','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270102','龙泉驿','成都','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270103','新都','成都','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270104','温江','成都','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270105','金堂','成都','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270106','双流','成都','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270107','郫县','成都','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270108','大邑','成都','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270109','蒲江','成都','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270110','新津','成都','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270111','都江堰','成都','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270112','彭州','成都','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270113','邛崃','成都','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270114','崇州','成都','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270115','青白江','成都','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270201','攀枝花','攀枝花','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270202','仁和','攀枝花','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270203','米易','攀枝花','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270204','盐边','攀枝花','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270301','自贡','自贡','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270302','富顺','自贡','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270303','荣县','自贡','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270401','绵阳','绵阳','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270402','三台','绵阳','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270403','盐亭','绵阳','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270404','安县','绵阳','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270405','梓潼','绵阳','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270406','北川','绵阳','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270407','平武','绵阳','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270408','江油','绵阳','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270501','南充','南充','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270502','南部','南充','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270503','营山','南充','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270504','蓬安','南充','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270505','仪陇','南充','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270506','西充','南充','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270507','阆中','南充','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270601','达州','达州','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270602','宣汉','达州','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270603','开江','达州','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270604','大竹','达州','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270605','渠县','达州','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270606','万源','达州','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270607','通川','达州','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270608','达县','达州','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270701','遂宁','遂宁','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270702','蓬溪','遂宁','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270703','射洪','遂宁','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270801','广安','广安','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270802','岳池','广安','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270803','武胜','广安','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270804','邻水','广安','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270805','华蓥','广安','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270901','巴中','巴中','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270902','通江','巴中','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270903','南江','巴中','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101270904','平昌','巴中','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271001','泸州','泸州','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271003','泸县','泸州','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271004','合江','泸州','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271005','叙永','泸州','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271006','古蔺','泸州','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271007','纳溪','泸州','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271101','宜宾','宜宾','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271103','宜宾县','宜宾','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271104','南溪','宜宾','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271105','江安','宜宾','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271106','长宁','宜宾','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271107','高县','宜宾','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271108','珙县','宜宾','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271109','筠连','宜宾','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271110','兴文','宜宾','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271111','屏山','宜宾','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271201','内江','内江','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271202','东兴','内江','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271203','威远','内江','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271204','资中','内江','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271205','隆昌','内江','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271301','资阳','资阳','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271302','安岳','资阳','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271303','乐至','资阳','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271304','简阳','资阳','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271401','乐山','乐山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271402','犍为','乐山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271403','井研','乐山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271404','夹江','乐山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271405','沐川','乐山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271406','峨边','乐山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271407','马边','乐山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271408','峨眉','乐山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271409','峨眉山','乐山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271501','眉山','眉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271502','仁寿','眉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271503','彭山','眉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271504','洪雅','眉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271505','丹棱','眉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271506','青神','眉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271601','凉山','凉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271603','木里','凉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271604','盐源','凉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271605','德昌','凉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271606','会理','凉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271607','会东','凉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271608','宁南','凉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271609','普格','凉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271610','西昌','凉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271611','金阳','凉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271612','昭觉','凉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271613','喜德','凉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271614','冕宁','凉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271615','越西','凉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271616','甘洛','凉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271617','雷波','凉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271618','美姑','凉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271619','布拖','凉山','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271701','雅安','雅安','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271702','名山','雅安','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271703','荥经','雅安','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271704','汉源','雅安','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271705','石棉','雅安','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271706','天全','雅安','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271707','芦山','雅安','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271708','宝兴','雅安','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271801','甘孜','甘孜','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271802','康定','甘孜','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271803','泸定','甘孜','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271804','丹巴','甘孜','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271805','九龙','甘孜','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271806','雅江','甘孜','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271807','道孚','甘孜','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271808','炉霍','甘孜','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271809','新龙','甘孜','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271810','德格','甘孜','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271811','白玉','甘孜','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271812','石渠','甘孜','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271813','色达','甘孜','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271814','理塘','甘孜','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271815','巴塘','甘孜','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271816','乡城','甘孜','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271817','稻城','甘孜','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271818','得荣','甘孜','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271901','阿坝','阿坝','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271902','汶川','阿坝','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271903','理县','阿坝','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271904','茂县','阿坝','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271905','松潘','阿坝','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271906','九寨沟','阿坝','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271907','金川','阿坝','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271908','小金','阿坝','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271909','黑水','阿坝','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271910','马尔康','阿坝','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271911','壤塘','阿坝','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271912','若尔盖','阿坝','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101271913','红原','阿坝','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101272001','德阳','德阳','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101272002','中江','德阳','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101272003','广汉','德阳','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101272004','什邡','德阳','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101272005','绵竹','德阳','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101272006','罗江','德阳','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101272101','广元','广元','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101272102','旺苍','广元','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101272103','青川','广元','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101272104','剑阁','广元','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101272105','苍溪','广元','四川');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280101','广州','广州','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280102','番禺','广州','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280103','从化','广州','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280104','增城','广州','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280105','花都','广州','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280201','韶关','韶关','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280202','乳源','韶关','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280203','始兴','韶关','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280204','翁源','韶关','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280205','乐昌','韶关','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280206','仁化','韶关','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280207','南雄','韶关','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280208','新丰','韶关','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280209','曲江','韶关','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280210','浈江','韶关','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280211','武江','韶关','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280301','惠州','惠州','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280302','博罗','惠州','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280303','惠阳','惠州','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280304','惠东','惠州','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280305','龙门','惠州','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280401','梅州','梅州','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280402','兴宁','梅州','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280403','蕉岭','梅州','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280404','大埔','梅州','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280406','丰顺','梅州','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280407','平远','梅州','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280408','五华','梅州','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280409','梅县','梅州','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280501','汕头','汕头','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280502','潮阳','汕头','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280503','澄海','汕头','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280504','南澳','汕头','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280601','深圳','深圳','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280701','珠海','珠海','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280702','斗门','珠海','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280703','金湾','珠海','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280800','佛山','佛山','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280801','顺德','佛山','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280802','三水','佛山','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280803','南海','佛山','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280804','高明','佛山','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280901','肇庆','肇庆','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280902','广宁','肇庆','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280903','四会','肇庆','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280905','德庆','肇庆','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280906','怀集','肇庆','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280907','封开','肇庆','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101280908','高要','肇庆','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281001','湛江','湛江','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281002','吴川','湛江','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281003','雷州','湛江','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281004','徐闻','湛江','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281005','廉江','湛江','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281006','赤坎','湛江','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281007','遂溪','湛江','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281008','坡头','湛江','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281009','霞山','湛江','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281010','麻章','湛江','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281101','江门','江门','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281103','开平','江门','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281104','新会','江门','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281105','恩平','江门','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281106','台山','江门','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281107','蓬江','江门','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281108','鹤山','江门','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281109','江海','江门','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281201','河源','河源','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281202','紫金','河源','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281203','连平','河源','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281204','和平','河源','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281205','龙川','河源','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281206','东源','河源','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281301','清远','清远','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281302','连南','清远','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281303','连州','清远','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281304','连山','清远','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281305','阳山','清远','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281306','佛冈','清远','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281307','英德','清远','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281308','清新','清远','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281401','云浮','云浮','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281402','罗定','云浮','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281403','新兴','云浮','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281404','郁南','云浮','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281406','云安','云浮','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281501','潮州','潮州','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281502','饶平','潮州','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281503','潮安','潮州','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281601','东莞','东莞','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281701','中山','中山','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281801','阳江','阳江','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281802','阳春','阳江','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281803','阳东','阳江','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281804','阳西','阳江','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281901','揭阳','揭阳','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281902','揭西','揭阳','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281903','普宁','揭阳','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281904','惠来','揭阳','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101281905','揭东','揭阳','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101282001','茂名','茂名','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101282002','高州','茂名','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101282003','化州','茂名','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101282004','电白','茂名','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101282005','信宜','茂名','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101282006','茂港','茂名','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101282101','汕尾','汕尾','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101282102','海丰','汕尾','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101282103','陆丰','汕尾','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101282104','陆河','汕尾','广东');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290101','昆明','昆明','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290103','东川','昆明','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290104','寻甸','昆明','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290105','晋宁','昆明','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290106','宜良','昆明','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290107','石林','昆明','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290108','呈贡','昆明','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290109','富民','昆明','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290110','嵩明','昆明','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290111','禄劝','昆明','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290112','安宁','昆明','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290113','太华山','昆明','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290201','大理','大理','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290202','云龙','大理','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290203','漾濞','大理','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290204','永平','大理','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290205','宾川','大理','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290206','弥渡','大理','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290207','祥云','大理','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290208','巍山','大理','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290209','剑川','大理','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290210','洱源','大理','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290211','鹤庆','大理','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290212','南涧','大理','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290301','红河','红河','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290302','石屏','红河','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290303','建水','红河','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290304','弥勒','红河','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290305','元阳','红河','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290306','绿春','红河','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290307','开远','红河','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290308','个旧','红河','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290309','蒙自','红河','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290310','屏边','红河','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290311','泸西','红河','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290312','金平','红河','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290313','河口','红河','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290401','曲靖','曲靖','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290402','沾益','曲靖','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290403','陆良','曲靖','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290404','富源','曲靖','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290405','马龙','曲靖','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290406','师宗','曲靖','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290407','罗平','曲靖','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290408','会泽','曲靖','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290409','宣威','曲靖','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290501','保山','保山','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290503','龙陵','保山','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290504','施甸','保山','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290505','昌宁','保山','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290506','腾冲','保山','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290601','文山','文山','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290602','西畴','文山','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290603','马关','文山','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290604','麻栗坡','文山','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290605','砚山','文山','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290606','丘北','文山','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290607','广南','文山','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290608','富宁','文山','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290701','玉溪','玉溪','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290702','澄江','玉溪','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290703','江川','玉溪','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290704','通海','玉溪','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290705','华宁','玉溪','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290706','新平','玉溪','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290707','易门','玉溪','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290708','峨山','玉溪','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290709','元江','玉溪','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290801','楚雄','楚雄','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290802','大姚','楚雄','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290803','元谋','楚雄','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290804','姚安','楚雄','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290805','牟定','楚雄','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290806','南华','楚雄','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290807','武定','楚雄','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290808','禄丰','楚雄','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290809','双柏','楚雄','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290810','永仁','楚雄','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290901','普洱','普洱','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290902','景谷','普洱','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290903','景东','普洱','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290904','澜沧','普洱','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290906','墨江','普洱','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290907','江城','普洱','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290908','孟连','普洱','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290909','西盟','普洱','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290911','镇沅','普洱','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101290912','宁洱','普洱','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291001','昭通','昭通','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291002','鲁甸','昭通','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291003','彝良','昭通','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291004','镇雄','昭通','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291005','威信','昭通','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291006','巧家','昭通','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291007','绥江','昭通','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291008','永善','昭通','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291009','盐津','昭通','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291010','大关','昭通','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291011','水富','昭通','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291101','临沧','临沧','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291102','沧源','临沧','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291103','耿马','临沧','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291104','双江','临沧','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291105','凤庆','临沧','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291106','永德','临沧','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291107','云县','临沧','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291108','镇康','临沧','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291201','怒江','怒江','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291203','福贡','怒江','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291204','兰坪','怒江','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291205','泸水','怒江','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291206','六库','怒江','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291207','贡山','怒江','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291301','香格里拉','迪庆','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291302','德钦','迪庆','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291303','维西','迪庆','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291304','中甸','迪庆','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291401','丽江','丽江','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291402','永胜','丽江','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291403','华坪','丽江','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291404','宁蒗','丽江','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291501','德宏','德宏','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291503','陇川','德宏','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291504','盈江','德宏','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291506','瑞丽','德宏','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291507','梁河','德宏','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291508','芒市','德宏','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291601','景洪','西双版纳','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291603','勐海','西双版纳','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101291605','勐腊','西双版纳','云南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300101','南宁','南宁','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300103','邕宁','南宁','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300104','横县','南宁','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300105','隆安','南宁','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300106','马山','南宁','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300107','上林','南宁','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300108','武鸣','南宁','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300109','宾阳','南宁','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300201','崇左','崇左','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300202','天等','崇左','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300203','龙州','崇左','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300204','凭祥','崇左','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300205','大新','崇左','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300206','扶绥','崇左','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300207','宁明','崇左','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300301','柳州','柳州','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300302','柳城','柳州','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300304','鹿寨','柳州','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300305','柳江','柳州','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300306','融安','柳州','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300307','融水','柳州','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300308','三江','柳州','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300401','来宾','来宾','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300402','忻城','来宾','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300403','金秀','来宾','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300404','象州','来宾','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300405','武宣','来宾','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300406','合山','来宾','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300501','桂林','桂林','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300503','龙胜','桂林','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300504','永福','桂林','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300505','临桂','桂林','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300506','兴安','桂林','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300507','灵川','桂林','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300508','全州','桂林','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300509','灌阳','桂林','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300510','阳朔','桂林','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300511','恭城','桂林','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300512','平乐','桂林','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300513','荔浦','桂林','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300514','资源','桂林','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300601','梧州','梧州','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300602','藤县','梧州','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300604','苍梧','梧州','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300605','蒙山','梧州','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300606','岑溪','梧州','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300701','贺州','贺州','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300702','昭平','贺州','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300703','富川','贺州','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300704','钟山','贺州','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300801','贵港','贵港','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300802','桂平','贵港','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300803','平南','贵港','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300901','玉林','玉林','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300902','博白','玉林','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300903','北流','玉林','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300904','容县','玉林','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300905','陆川','玉林','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101300906','兴业','玉林','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301001','百色','百色','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301002','那坡','百色','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301003','田阳','百色','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301004','德保','百色','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301005','靖西','百色','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301006','田东','百色','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301007','平果','百色','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301008','隆林','百色','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301009','西林','百色','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301010','乐业','百色','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301011','凌云','百色','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301012','田林','百色','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301101','钦州','钦州','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301102','浦北','钦州','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301103','灵山','钦州','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301201','河池','河池','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301202','天峨','河池','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301203','东兰','河池','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301204','巴马','河池','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301205','环江','河池','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301206','罗城','河池','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301207','宜州','河池','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301208','凤山','河池','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301209','南丹','河池','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301210','都安','河池','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301211','大化','河池','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301301','北海','北海','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301302','合浦','北海','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301303','涠洲岛','北海','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301401','防城港','防城港','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301402','上思','防城港','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301403','东兴','防城港','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101301405','防城','防城港','广西');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310101','海口','海口','海南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310201','三亚','三亚','海南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310202','东方','东方','海南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310203','临高','临高','海南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310204','澄迈','澄迈','海南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310205','儋州','儋州','海南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310206','昌江','昌江','海南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310207','白沙','白沙','海南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310208','琼中','琼中','海南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310209','定安','定安','海南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310210','屯昌','屯昌','海南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310211','琼海','琼海','海南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310212','文昌','文昌','海南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310214','保亭','保亭','海南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310215','万宁','万宁','海南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310216','陵水','陵水','海南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310217','西沙','西沙','海南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310220','南沙','南沙','海南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310221','乐东','乐东','海南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310222','五指山','五指山','海南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310224','中沙','中沙','海南');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101320101','香港','香港','香港');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101320102','九龙','香港','香港');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101320103','新界','香港','香港');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101330101','澳门','澳门','澳门');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101330102','氹仔岛','澳门','澳门');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101330103','路环岛','澳门','澳门');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101340101','台北','台北','台湾');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101340102','桃园','台北','台湾');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101340103','新竹','台北','台湾');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101340104','宜兰','台北','台湾');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101340201','高雄','高雄','台湾');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101340202','嘉义','高雄','台湾');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101340203','台南','高雄','台湾');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101340204','台东','高雄','台湾');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101340205','屏东','高雄','台湾');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101340401','台中','台中','台湾');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101340402','苗栗','台中','台湾');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101340403','彰化','台中','台湾');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101340404','南投','台中','台湾');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101340405','花莲','台中','台湾');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101340406','云林','台中','台湾');");
        db.execSQL(
                "INSERT INTO city_list(ID,District,City,Province) VALUES ('CN101310230','南子岛','南子岛','海南');");
    }
}
