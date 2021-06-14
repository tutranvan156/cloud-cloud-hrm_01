//package com.inet.hrm.bo;
//
//import com.inet.xportal.nosql.web.bf.MagicContentBF;
//import com.inet.xportal.nosql.web.bo.MagicContentBO;
//import com.inet.xportal.nosql.web.data.SearchDTO;
//import com.inet.xportal.web.interfaces.BeanInitiateInvoke;
//import com.inet.xportal.xdb.persistence.JSONDB;
//import com.inet.xportal.xdb.query.impl.QueryImpl;
//
//import javax.inject.Inject;
//import javax.inject.Named;
//
////bo kiếm bf; bf kiếm provider; DB; service trả về giao diện
////tạo class AssetBO dựa vào model Asset đã có
////extends MagicContentBO<>; truyền Model Asset vào MagicContentBO
//@Named("hrm_assetbo")
//public class AssetBO extends MagicContentBO<Asset> implements BeanInitiateInvoke {
//    @Inject
//    protected AssetBO(MagicContentBF businessFacade) {
//        super(businessFacade, "hrm-asset");
//    }
//
//    public Asset save(Asset asset) {
//        asset.setUuid(super.add(asset));
//        return asset;
//    }
//
//    public Asset update(Asset asset) {
//        super.update(asset.getUuid(), asset);
//        return asset;
//    }
//
//    public void remove(String uuid) {
//        super.remove(uuid);
//    }
//
//
//    public SearchDTO<Asset> findAll() {
//        QueryImpl<JSONDB> query = new QueryImpl<>();
//        return super.query(query);
//    }
//
//    //implement methods
//    //Trả về Lớp Asset
//    @Override
//    protected Class<Asset> getClassConvetor() {
//        return Asset.class;
//    }
//
//    @Override
//    public void init() {
//
//    }
//}
