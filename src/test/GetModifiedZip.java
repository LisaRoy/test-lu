package test;

import java.util.List;

/**
 * 增量包制作工具. <br>
 * 类详细说明. 修改main方法下的参数：ctx和txtName txt文件示例：
 * /WEB-INF/classes/com/cplatform/mall/back
 * /storeV2/web/StoreV2ManageController.class
 * /WEB-INF/views/includes/storeV2Head.jsp /static/js/region/regionSelect.js
 * 不能出现文件夹的目录，如： /static/js/region
 * <p>
 * Copyright: Copyright (c) 2016年4月7日 上午11:26:05
 * <p>
 * Company: 苏州宽连信息技术有限公司
 * <p>
 * 
 * @author luhy@c-platform.com
 * @version 1.0.0
 **/
public class GetModifiedZip {

	/**
	 * main函数.
	 * 
	 * @param args
	 *            启动参数
	 * @throws Exception
	 *             Exception
	 */
	public static void main(String... args) throws Exception {
		/** 文件夹路径(所有文件路径均为左斜杠"/") **/
		// final String ctx = "F:/workspace/mall-back-jx-luhy/target/mall-back";
		// final String ctx =
		// "E:/data/javaWorkspace/appItemRemark/target/appItemRemark";
		/*
		 * final String ctx =
		 * "E:/data/javaWorkspace/app-back-160504/target/app-back";
		 */
		/*
		 * final String ctx =
		 * "E:/data/javaWorkspace/mall-back-160525-STORY1321/target/mall-back";
		 */
		final String ctx = "E:/data/javaWorkspace/store-back-20160525-STORY1321/target/store-back";

		/** 路径txt文件名(不包含后缀名) **/
		final String txtName = "上线路径";

		final String ctxOld = ctx;
		final String ctxNew = ctx + "-temp" + ctx.substring(ctx.lastIndexOf("/"), ctx.length());
		final String pathTxt = ctx.substring(0, ctx.lastIndexOf("/") + 1) + txtName + ".txt";
		List<String> pathList = ReadFileUtils.getPathList(pathTxt);
		Long i = 0L;
		for (String path : pathList) {
			i++;
			CopyUtils.copyFile(ctxOld + path, ctxNew + path);
		}
		System.out.println("共复制了:" + i + "个文件！");
		try {
			ZipCompressorByAnt zca = new ZipCompressorByAnt(ctxOld + ".zip");
			zca.compressExe(ctxNew.substring(0, ctxNew.lastIndexOf("/") + 1));
			System.out.println("压缩文件夹成功！");
			System.out.println("压缩文件地址:\r\n" + ctxOld + ".zip");
		}
		catch (Exception ex) {
			System.out.println("压缩文件夹失败！");
		}
	}
}
