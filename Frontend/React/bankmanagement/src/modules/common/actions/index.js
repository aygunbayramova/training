export const TYPE_ACCOUNTS = 'ACCOUNTS';
export const TYPE_NACES = 'NACES';
//ACTIONS
export const ACTION_POPULATE = 'POPULATE';
export const ACTION_LOADDATA = 'LOAD_DATA';


//ACTION CREATORS
export const populateData = (filteredData, dataType) => {
    return {
        type: ACTION_POPULATE,
        dataType: dataType,
        data: filteredData
    }
}
export const loadDataActionCreator = (dataType) => {
    return {
        type: ACTION_LOADDATA,
        dataType: dataType
    }
};

export const getActionCreator = (dataType, action) => {
    return {
        type: ACTION_LOADDATA,
        dataType: dataType,
        data: action.data
    }
};