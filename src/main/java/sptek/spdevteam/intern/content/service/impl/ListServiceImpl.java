package sptek.spdevteam.intern.content.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sptek.spdevteam.intern.common.LogUtil;
import sptek.spdevteam.intern.common.mybatis.CommonMapper;
import sptek.spdevteam.intern.content.domain.ListDomain;
import sptek.spdevteam.intern.content.domain.SrcDto;
import sptek.spdevteam.intern.content.domain.TempType;
import sptek.spdevteam.intern.content.mybatis.FilterMapper;
import sptek.spdevteam.intern.content.service.ListService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListServiceImpl implements ListService {

    private LogUtil log = new LogUtil(ListServiceImpl.class);

    private final FilterMapper filterMapper;

    @Override
    public List<TempType> getTempList() {
        return filterMapper.getTempList();
    }

}
