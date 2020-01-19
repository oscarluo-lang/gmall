package com.sap.gmall.pms;

import com.sap.gmall.pms.service.impl.BaseAttrValueServiceImpl;
import com.sap.gmall.pms.service.impl.BrandServiceImpl;
import gmall.pms.entity.BaseAttrValue;
import gmall.pms.entity.Brand;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallPmsApplicationTests {
	@Autowired
	BaseAttrValueServiceImpl baseAttrValueServiceImpl;

	@Autowired
	BrandServiceImpl brandServiceImpl;
	@Test
	public void contextLoads() {
//		BaseAttrValue byId = baseAttrValueServiceImpl.getById(66);
//		System.out.println(byId.getValueName());

		//测试增删改在主库，查在从库
//		Brand brand = new Brand();
//		brand.setName("哈哈哈");
//		brandServiceImpl.save(brand);
//		System.out.println("保存成功");

		Brand brand = brandServiceImpl.getById(53);
		System.out.println("oscar::::" + brand.getName());
	}

}
